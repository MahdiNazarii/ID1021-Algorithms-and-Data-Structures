public class run {
    public static void main(String[] args){

        // To find the last digit of the personal number
        Item a1 = new Item();
        Item a2 = new Item();
        Item a3 = new Item();
        Item a4 = new Item();
        Item a5 = new Item();
        Item a6 = new Item();
        Item a7 = new Item();
        Item a8 = new Item();
        Item a9 = new Item();
        Item a10 = new Item();
        Item a11 = new Item();
        Item a12 = new Item();
        Item a13 = new Item();
        Item a14 = new Item();
        Item a15 = new Item();
        Item a16 = new Item();
        Item a17 = new Item();
        Item a18 = new Item();
        Item a19 = new Item();
        Item a20 = new Item();
        Item a21 = new Item();
        Item a22 = new Item();
        Item a23 = new Item();
        Item a24 = new Item();
        Item a25 = new Item();
        Item a26 = new Item();
        Item a27 = new Item();
        Item a28 = new Item();
        Item a29 = new Item();
        Item a30 = new Item();
        Item a31 = new Item();

        // The formula in RPN (Revearce Polish Notation);
        //10(y1)2*´(y2)+(m1)2*´(m2)++(d1)2*´(d2)+(n1)2*´(n2)+++(n3)2*´+ 10 Modulo - 

        a1.value = 10;
        a1.type = ItemType.VALUE;
        a2.value = 9;
        a2.type = ItemType.VALUE;
        a3.value = 2;
        a3.type = ItemType.VALUE;
        a4.type = ItemType.SPMUL;
        a5.value = 9;
        a5.type = ItemType.VALUE;
        a6.type = ItemType.ADD;
        a7.value = 0;
        a7.type = ItemType.VALUE;
        a8.value = 2;
        a8.type = ItemType.VALUE;
        a9.type = ItemType.SPMUL;
        a10.value = 2;
        a10.type = ItemType.VALUE;
        a11.type = ItemType.ADD;
        a12.type = ItemType.ADD;
        a13.value = 1;
        a13.type = ItemType.VALUE;
        a14.value = 2;
        a14.type = ItemType.VALUE;
        a15.type = ItemType.SPMUL;
        a16.value = 2;
        a16.type = ItemType.VALUE;
        a17.type = ItemType.ADD;
        a18.value = 1;
        a18.type = ItemType.VALUE;
        a19.value = 2;
        a19.type = ItemType.VALUE;
        a20.type = ItemType.SPMUL;
        a21.value = 4;
        a21.type = ItemType.VALUE;
        a22.type = ItemType.ADD;
        a23.type = ItemType.ADD;
        a24.type = ItemType.ADD;
        a25.value = 3;
        a25.type = ItemType.VALUE;
        a26.value = 2;
        a26.type = ItemType.VALUE;
        a27.type = ItemType.SPMUL;
        a28.type = ItemType.ADD;
        a29.value = 10;
        a29.type = ItemType.VALUE;
        a30.type = ItemType.MODO;
        a31.type = ItemType.SUB;



        Item[] array = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,
        a27,a28,a29,a30,a31};

        Calculator rpn = new Calculator(array);
        // start calculate the time
        long t0 = System.nanoTime();
        int result = rpn.run();
        long t1 = System.nanoTime();

        System.out.println("Your last digit is: " + result);
        System.out.println(" resolution " + (t1 - t0)/1000 + " microseconds");

        
        /* 
       Item a1 = new Item();
       Item a2 = new Item();
       Item a3 = new Item();

       a1.setValue(6); 
       a1.setType(ItemType.VALUE);

       a2.setValue(3); 
       a2.setType(ItemType.VALUE);

       a3.setType(ItemType.ADD);

       Item [] expr = {a1, a2, a3};

       Calculator cal = new Calculator(expr);
       System.out.println(cal.run());
       */
    }
}
