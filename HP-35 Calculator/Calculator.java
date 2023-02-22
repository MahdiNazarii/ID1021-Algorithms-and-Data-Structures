public class Calculator {
    Item[] expr;
    int ip;
    Stack stack;

    public Calculator(Item[] expr) {
        this.expr = expr;
        this.ip = 0;
        this.stack = new Stack();
        }

        public int run() {
        while ( ip < expr.length ) {
        step();
        }
        return stack.pop();
    }
    
    public void step() {
        Item nxt = expr[ip++];
        switch(nxt.getType()) {

        case ADD : {
        int y = stack.pop();
        int x = stack.pop();
        stack.push(x + y);
        System.out.println("The value is pushed: " + (x+y));
        break;
        }

        case SUB : {
            int y = stack.pop();
            int x = stack.pop();
            stack.push(x - y);
            System.out.println("The value is pushed: " + (x-y));
            break; 
        }

        case MUL : {
            int y = stack.pop();
            int x = stack.pop();
            stack.push(x * y);
            System.out.println("The value is pushed: " + (x*y));
            break; 
        }

        case DIV : {
            int y = stack.pop();
            int x = stack.pop();
            stack.push(x / y);
            System.out.println("The value is pushed: " + (x/y));

            break; 
        }

        case MODO : {
            int y = stack.pop();
            int x = stack.pop();
            stack.push(x % y);
            System.out.println("The value is pushed: " + (x%y));
            break;
    }
        case SPMUL : {
            int y = stack.pop();
            int x = stack.pop();
            stack.push((x*y)/10 + (x*y)%10);
            System.out.println("The value is pushed: " + ((x*y)/10 + (x*y)%10));
            break;

        }

        case VALUE: {
           stack.push(expr[ip-1].value);
            run();
        }
        default : {
            break;
        }
    }
    
    }
}
