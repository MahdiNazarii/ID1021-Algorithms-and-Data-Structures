import java.io.BufferedReader;
import java.io.FileReader;

public class Zip2{
    Node[] data;
    Integer [] size;
    int max;

    public class Node {
        Integer code;
        String name;
        Integer pop;
        
        public Node(Integer code, String name, Integer pop){
            this.code = code;
            this.name = name;
            this.pop = pop;
        }

    }
    public Zip2(String file) {
        data = new Node[10000];
        size = new Integer[10000]; // to create a new array size t store the code
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        int i = 0;
        int j = 0;
        while ((line = br.readLine()) != null) {
            String[] row = line.split(",");
            Integer code = Integer.valueOf(row[0].replaceAll("\\s",""));
            size[j++] = code; // insert each code in the array size
            data[i++] = new Node(code, row[1], Integer.valueOf(row[2]));
      
        }
        max = i-1;
        } catch (Exception e) {
        System.out.println(" file " + file + " not found");
        }
    }


    public Node lookup(Integer c){
        int first = 0;
        int last = data.length -1;
        while (true) {
            // jump to the middle
            int index = first + ((last - first)/2);

            if (data[index] != null && data[index].code.compareTo(c) == 0) {
            // hmm what now?
            return data[index];
            }

            if (data[index] != null && data[index].code.compareTo(c) < 0 && index < last) {
            // The index position holds something that is less than
            // what we're looking for, what is the first possible page?
            first = index + 1;
            continue;
            }
            if (data[index] != null && data[index].code.compareTo(c) > 0 && index > first) {
            // The index position holds something that is larger than
            // what we're looking for, what is the last possible page?
            last = index - 1 ;
            continue;
            }
            // Why do we land here? What should we do?
            // Asnswer: The key does not exist in the array. We should break the while loop
            
            break;
        }
        return null;
    }




    public String lookupLinear(Integer c){
        String found = "NOT FOUND!";
        for(int i=0; i<max; i++){
            if(data[i] != null && data[i].code.equals(c)){
                found = data[i].name;
                break;
            }
        }
        return found;     
    }




////////////////////////////////////////////////////
    public void collisions(int mod) {
        int[] data = new int[mod];
        int[] cols = new int[10];
        for (int i = 0; i < max; i++) {
            if(this.data[i] != null){
                Integer index = size[i] % mod;
                cols[data[index]]++;
                data[index]++;
            }
        }
        System.out.print(mod);
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + cols[i]);
        }
        System.out.println();
        }
//////////////////////////////////////////////////////



    public static void main(String[] args){
        Zip2 postn = new Zip2("postnummer.csv");
        System.out.println(postn.lookup(11115).name);
        System.out.println(postn.lookup(11115).pop);
        System.out.println(postn.lookup(99499));
        System.out.println(postn.lookup(16453).name);
        System.out.println(postn.lookup(16453).pop);
       

    }
}