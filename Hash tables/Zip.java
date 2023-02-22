import java.io.BufferedReader;
import java.io.FileReader;

public class Zip {
    Node[] data;
    int max;
    public class Node {
        String code;
        String name;
        Integer pop;
        
        public Node(String code, String name, Integer pop){
            this.code = code;
            this.name = name;
            this.pop = pop;
        }

    }
    public Zip(String file) {
        data = new Node[10000];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        int i = 0;
        while ((line = br.readLine()) != null) {
            String[] row = line.split(",");
            data[i++] = new Node(row[0], row[1], Integer.valueOf(row[2]));
        }
        max = i-1;
        
        } catch (Exception e) {
        System.out.println(" file " + file + " not found");
        }
    }

    public String lookup(String c){
        int first = 0;
        int last = data.length -1;
        while (true) {
            // jump to the middle
            int index = first + ((last - first)/2);

            if (data[index] != null && data[index].code.equals(c)) {
            // hmm what now?
            return data[index].name;
            }

            if (data[index] != null && data[index].code.compareTo(c) < 0  && index < last) {
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
        return "NOT FOUND!";
    }

    public String lookupLinear(String c){
        String found = "NOT FOUND!";
        for(int i=0; i<max; i++){
            if(data[i] != null && data[i].code.equals(c)){
                found = data[i].name;
                break;
            }
        }
        return found;     
    }
    
    public static void main(String[] args){
        Zip postn = new Zip("postnummer.csv");
        // System.out.println("Binary search: " + postn.lookup("111 15"));
        // System.out.println("Binary search:  " + postn.lookup("994 99"));

        System.out.println("Linear: " + postn.lookupLinear("111 15"));
        System.out.println("Linear:  " + postn.lookupLinear("994 99"));
    }


   
}