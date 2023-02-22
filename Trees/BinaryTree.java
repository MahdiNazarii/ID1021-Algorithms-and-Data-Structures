import java.util.Iterator;
public class BinaryTree implements Iterable<Integer> {
    
    class Node {
        public Integer key;
        public Integer value;
        public Node left, right;
        
        public Node(Integer key, Integer value) {
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
        }
        

        // a function to print the nodes in depth-first order
        public void print() {
            if(left != null){
                left.print();
            }
            System.out.println(" key: " + key + "\tvalue: " + value);
            if(right != null){
                right.print();
            }
        }
        

        // a function to add an element to the tree
        public Node add(Integer k, Integer v){
            if(this.key == k){
                this.value = v;
            }
            if(this.key > k){
                if(this.left == null){
                    this.left = new Node(k, v);
                }
                else{
                    this.left = this.left.add(k,v);
                }
            }
            else{
                if(this.right == null){
                    this.right = new Node(k, v);
                }
                else{
                    this.right = this.right.add(k,v);
                }
                
            }
            return this;
        }
        
        
        // a function to look for an element in the tree by its key
        public int lookup(Integer k){
            Node cur = this;
            while(cur != null){
                if(cur.key == k){
                    return cur.value;
                }
                else if(cur.key > k){
                    cur = cur.left;
                }
                else{
                    cur = cur.right;
                }
            }
            return -1;
        }
    }
    
    
    static Node root;
    

    public BinaryTree() {
        root = null;
    }
    

    public Integer lookup(Integer key){
        return root.lookup(key);
    }
    

    public void add(Integer key, Integer value){
        if(root == null){
            root = new Node(key, value);
        }
        else{
            root.add(key,value);
        }
    }


    public Iterator<Integer> iterator() {
        return new TreeIterator();
    }
}











    
    


