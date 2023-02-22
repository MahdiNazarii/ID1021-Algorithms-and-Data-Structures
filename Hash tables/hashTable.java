import java.io.BufferedReader;
import java.io.FileReader;

public class hashTable {
    int max;
    int mod; 
    Node [] bucket;
    int comparison;

    public class Node {
        Integer code;
        String name;
        Integer pop;
        Node next;
        
        public Node(Integer code, String name, Integer pop){
            this.code = code;
            this.name = name;
            this.pop = pop;
            this.next = null;
        }

    }
    
    
    public hashTable(String file ,Integer modulo) {
        this.mod = modulo;
        bucket = new Node[mod];
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                Integer code = Integer.valueOf(row[0].replaceAll("\\s",""));
                insert(new Node(code, row[1], Integer.valueOf(row[2])));
            }
            max = i-1;
        } catch (Exception e) {
            System.out.println(" file " + file + " not found");
        }
    }
    


    private void insert(Node newNode){
        int index = (newNode.code % mod);
        Node nxt = bucket[index];
        Node prev = null;
        if(nxt == null){
            bucket[index] = newNode;
            return;
        }
        while(nxt != null){
            // if(newNode.code.equals(nxt.code)){
            //     nxt = nxt.next;
            //     break;
            // }
            prev = nxt;
            nxt = nxt.next;
        }
        prev.next = newNode;
        return;
    }




    public String lookup(Integer code){
        String found = "NOT FOUND!";
        int index = code % mod;
        Node nxt = bucket[index];
        comparison = 0;

        if(nxt == null){
            return found;
        }
        while(nxt != null){
            comparison++;
            if(code.equals(nxt.code)){
                found = nxt.name;
                break;
            }
            nxt = nxt.next;
        }
        return found;
    }



    public static void main(String[] args){
        hashTable ht = new hashTable("postnummer.csv", 11587);
        System.out.println(ht.lookup(16453) + "\t Have been looked at " + ht.comparison + " elements.");
        System.out.println(ht.lookup(53151) + "\t Have been looked at " + ht.comparison + " elements.");
        System.out.println(ht.lookup(11115) + "\t Have been looked at " + ht.comparison + " elements.");
        System.out.println(ht.lookup(12156) + "\t Have been looked at " + ht.comparison + " elements.");
        System.out.println(ht.lookup(44696) + "\t Have been looked at " + ht.comparison + " elements.");
        System.out.println(ht.lookup(70224) + "\t Have been looked at " + ht.comparison + " elements.");
        System.out.println(ht.lookup(70358) + "\t Have been looked at " + ht.comparison + " elements.");

       

    }
    
}
