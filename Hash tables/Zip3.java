import java.io.BufferedReader;
import java.io.FileReader;

public class Zip3 {
    Node[] data;
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
    public Zip3(String file) {
        data = new Node[100000];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        int i = 0;
        while ((line = br.readLine()) != null) {
            String[] row = line.split(",");
            Integer code = Integer.valueOf(row[0].replaceAll("\\s",""));
            data[code] = new Node(code, row[1], Integer.valueOf(row[2]));
       
        }
        max = i-1;
        } catch (Exception e) {
        System.out.println(" file " + file + " not found");
        }
    }



    public Node lookup(Integer code){
        return data[code];
    }




    public static void main(String[] args){
        Zip3 postn = new Zip3("postnummer.csv");
        // System.out.println(postn.lookup(11115).name);
        // System.out.println(postn.lookup(11115).pop);
        // System.out.println(postn.lookup(99499));
        // System.out.println(postn.lookup(16453).name);
        // System.out.println(postn.lookup(16453).pop);
        
    }
}
