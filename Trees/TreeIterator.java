import java.util.Iterator;
public class TreeIterator implements Iterator<Integer> { // a class of binary tree which implements an iterable interface.

    private BinaryTree.Node next;
    private Stack<BinaryTree.Node> stack;
    
    public TreeIterator() {
        stack = new Stack<BinaryTree.Node>();
        next = BinaryTree.root;
        while(next != null){
            stack.push(next);
            next = next.left;
        }
    }


    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Integer next() {
        if(hasNext() == false){
            return null;
        }
        BinaryTree.Node tempNode = stack.pop();
        while(tempNode.right != null){
            stack.push(tempNode.right);
            tempNode.right = tempNode.right.left;
        }
        return tempNode.value;
    }


    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

} 