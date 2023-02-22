import java.util.Iterator;
public class TreeIterator implements Iterator<Integer> { // a class of binary tree which implements an iterable interface.

    private BinaryTree.Node next;
    private Queue<BinaryTree.Node> queue;
    
    public TreeIterator() {
        queue = new Queue(BinaryTree.root);
       
    }


    @Override
    public boolean hasNext() {
        return (queue.head != null);
    }

    @Override
    public Integer next() {
        if(hasNext() == false){
            return null;
        }
        else{
            BinaryTree.Node tempNode = queue.head.item;
            if(tempNode.left != null){
                queue.add(tempNode.left);
            }
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
            tempNode = queue.remove();
            return tempNode.value;
        }
    }


    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

} 