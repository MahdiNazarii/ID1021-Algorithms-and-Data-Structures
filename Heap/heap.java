public class heap {

    class Node {
        Integer value;
        Node left, right;
        int size;
        
        private Node(Integer value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.size = 1;
        }
        

        // a function to print the nodes in depth-first order
        public void print() {
            if(left != null){
                left.print();
            }
            System.out.println("value: " + value);
            if(right != null){
                right.print();
            }
        }
        

        // a function to add an element to the tree
        public Integer add(Integer v){
            //Node current = this;
            this.size += 1;
            Integer bubble = null;

            if(this.value > v) {
                bubble = this.value;
                this.value = v;
            } else {
                bubble = v;
            }
            if(this.left == null){
                this.left = new Node(bubble);
                return 1; // return depth
            } else if (this.right == null) {
                this.right = new Node(bubble);
                return 1; // return depth
            } else if (this.right.size < this.left.size ){
                return this.right.add(bubble) + 1; // return depth
            } else {
                return this.left.add(bubble) + 1; // return depth
            }
        }


        
        public Node remove(){
            if(this.left == null){
                return this.right;
            }
            if(this.right == null){
                return this.left;
            }
            if(this.left.value < this.right.value){
                this.value = this.left.value;
                this.size--;
                if(this.left.size == 0){
                    this.left = null;
                }
                else{
                    this.left = this.left.remove();
                }
                return this;
            }
            else{
                this.value = this.right.value;
                this.size--;
                if(this.right.size == 0){
                    this.right = null;
                }
                else{
                    this.right = this.right.remove();
                }
                //this.size--;
                return this;
            }

        }

        public Integer push(Integer incr){
            Integer bubble = null;
           if(this.left == null && this.right == null){
                this.value = this.value + incr;
                return 0;

           }
            if(this.left != null && this.left.value < this.value + incr){
                if(this.right != null && this.right.value < this.left.value){
                    bubble = this.right.value;
                    this.right.value = this.value;
                    this.value = bubble;
                    return this.right.push(incr) + 1;
                }
                else{
                    bubble = this.left.value;
                    this.left.value = this.value;
                    this.value = bubble;
                    return this.left.push(incr) + 1;
                }
            }
            else if(this.right != null && this.right.value < this.value + incr){
                if(this.left != null && this.left.value < this.right.value){
                    bubble = this.left.value;
                    this.left.value = this.value;
                    this.value = bubble;
                    return this.left.push(incr) + 1;
                }
                else{
                    bubble = this.right.value;
                    this.right.value = this.value;
                    this.value = bubble;
                    return this.right.push(incr) + 1;
                }  
            }
            else{
                this.value = this.value + incr;
                return 0;
            } 
            
        }
        
    
        
       
    }
    
    
    Node root;
    

    public heap() {
        root = null;
    }
    
    // public void add(Integer value){
    //     if(root == null){
    //         root = new Node(value);
    //     }
    //     else{
    //         root.add(value);
    //     }
    // }
 //////////////////////////////////// An add which method which returns depth
    public Integer add(Integer value){
        if(root == null){
            root = new Node(value);
            return 0; 
        }
        else{
            return root.add(value);
        }
    }

////////////////////////////////////////


    public Integer remove(){
        if(root.size == 1){
            Node removedNode = root;
            root = null;
            return removedNode.value;           
        }
        else{
            return root.remove().value; // root.remove() return a node and we return its value
        }
    }

    public Integer push(Integer incr){
        return root.push(incr);
    }


    ////////////////////////////////////
    public void print(){
        if(root != null){
            root.print();
        }
        else{
            return;
        }
    }
}

