public class benchMark {
    public static void main(String[] args){
        // Benchmark linear search vs binary search
        // Zip postn = new Zip("postnummer.csv");
        // int loop = 100;
        // System.out.println("CODE AS STRINGS");
        // System.out.printf("------------------------------------------------------------------------------------- \n");
        // System.out.printf("%-23s %-23s %-23s %-10s \n", "111 15 Linear" , "994 99 Linear" , "111 15 Binary" , "994 49 Binary");
        // System.out.printf("--------------------------------------------------------------------------------------\n");
        // double minTimeL1 = Double.MAX_VALUE;
        // double minTimeL2 = Double.MAX_VALUE;
        // double minTimeB1 = Double.MAX_VALUE;
        // double minTimeB2 = Double.MAX_VALUE;
        // for(int i=0; i<loop; i++){

        //     double t0 = System.nanoTime();
        //     postn.lookupLinear("111 15");
        //     double t1 = System.nanoTime();

        //     double t_totL1 = (t1 - t0);
        //     if(t_totL1 < minTimeL1){
        //         minTimeL1 = t_totL1;
        //     }

        //     double t2 = System.nanoTime();
        //     postn.lookupLinear("994 99");
        //     double t3 = System.nanoTime();

        //     double t_totL2 = (t3 - t2);
        //     if(t_totL2 < minTimeL2){
        //         minTimeL2 = t_totL2;
        //     }

        //     double t4 = System.nanoTime();
        //     postn.lookup("111 15");
        //     double t5 = System.nanoTime();

        //     double t_totB1 = (t5 - t4);
        //     if(t_totB1 < minTimeB1){
        //         minTimeB1 = t_totB1;
        //     }

        //     double t6 = System.nanoTime();
        //     postn.lookup("994 99");
        //     double t7 = System.nanoTime();

        //     double t_totB2 = (t7 - t6);
        //     if(t_totB2 < minTimeB2){
        //         minTimeB2 = t_totB2;
        //     }
            
        // }
       
        // System.out.println((long)minTimeL1 + "ns" + " \t\t\t" + (long)minTimeL2 + " ns." + " \t\t" + (long)minTimeB1 + " ns." + " \t\t" + (long)minTimeB2 + " ns.");
        // System.out.printf("--------------------------------------------------------------------------------------\n");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Benchmark linear search vs binary search where code is stored as integers 
        // Zip2 postn2 = new Zip2("postnummer.csv");
        // int loop = 100;
        // System.out.println("\n\nCODE AS INTEGERS");
        // System.out.printf("------------------------------------------------------------------------------------- \n");
        // System.out.printf("%-23s %-23s %-23s %-10s \n", "111 15 Linear" , "994 99 Linear" , "111 15 Binary" , "994 49 Binary");
        // System.out.printf("--------------------------------------------------------------------------------------\n");
        // double minTimeLin1 = Double.MAX_VALUE;
        // double minTimeLin2 = Double.MAX_VALUE;
        // double minTimeBin1 = Double.MAX_VALUE;
        // double minTimeBin2 = Double.MAX_VALUE;
        // for(int i=0; i<loop; i++){

        //     double t0 = System.nanoTime();
        //     postn2.lookupLinear(11115);
        //     double t1 = System.nanoTime();

        //     double t_totL1 = (t1 - t0);
        //     if(t_totL1 < minTimeLin1){
        //         minTimeLin1 = t_totL1;
        //     }

        //     double t2 = System.nanoTime();
        //     postn2.lookupLinear(99499);
        //     double t3 = System.nanoTime();

        //     double t_totL2 = (t3 - t2);
        //     if(t_totL2 < minTimeLin2){
        //         minTimeLin2 = t_totL2;
        //     }

        //     double t4 = System.nanoTime();
        //     postn2.lookup(11115);
        //     double t5 = System.nanoTime();

        //     double t_totB1 = (t5 - t4);
        //     if(t_totB1 < minTimeBin1){
        //         minTimeBin1 = t_totB1;
        //     }

        //     double t6 = System.nanoTime();
        //     postn2.lookup(99499);
        //     double t7 = System.nanoTime();

        //     double t_totB2 = (t7 - t6);
        //     if(t_totB2 < minTimeBin2){
        //         minTimeBin2 = t_totB2;
        //     }
            
        // }
       
        // System.out.println((long)minTimeLin1 + "ns" + " \t\t\t" + (long)minTimeLin2 + " ns." + " \t\t" + (long)minTimeBin1 + " ns." + " \t\t" + (long)minTimeBin2 + " ns.");
        // System.out.printf("--------------------------------------------------------------------------------------\n");


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Benchmark binary search i zip2 vs lookup i zip 3
        // Zip2 postn2 = new Zip2("postnummer.csv");
        // Zip3 postn3 = new Zip3("postnummer.csv");
        // int loop = 100;
        // System.out.printf("------------------------------------------------------------------------------------------------\n");
        // System.out.printf("%-23s %-23s  %-23s %-10s\n", "111 15 Binary" , "994 99 Binary", "111 15 Constant" , "994 99 Constant");
        // System.out.printf("-------------------------------------------------------------------------------------------------\n");
        // double minTB1 = Double.MAX_VALUE;
        // double minTB2 = Double.MAX_VALUE;
        // double minTC1 = Double.MAX_VALUE;
        // double minTC2 = Double.MAX_VALUE;
        // for(int i=0; i<loop; i++){

        //     double t0 = System.nanoTime();
        //     postn2.lookup(11115);
        //     double t1 = System.nanoTime();

        //     double t_B1 = (t1 - t0);
        //     if(t_B1 < minTB1){
        //         minTB1 = t_B1;
        //     }


        //     double t2 = System.nanoTime();
        //     postn2.lookup(99499);
        //     double t3 = System.nanoTime();

        //     double t_B2 = (t3 - t2);
        //     if(t_B2 < minTB2){
        //         minTB2 = t_B2;
        //     }

        //     double t4 = System.nanoTime();
        //     postn3.lookup(11115);
        //     double t5 = System.nanoTime();

        //     double t_C1 = (t5 - t4);
        //     if(t_C1 < minTC1){
        //         minTC1 = t_C1;
        //     }

        //     double t6 = System.nanoTime();
        //     postn3.lookup(99499);
        //     double t7 = System.nanoTime();

        //     double t_C2 = (t7 - t6);
        //     if(t_C2 < minTC2){
        //         minTC2 = t_C2;
        //     }

        // }
       
        // System.out.println((long)minTB1 + "ns" + " \t\t\t" + (long)minTB2 + " ns." + " \t\t\t" + (long)minTC1 + "ns" + "\t\t\t" + (long)minTC2 + " ns.");
        // System.out.printf("-------------------------------------------------------------------------------------------\n");


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        // To get number of collisions for a mod number between 10000-20000
        // Zip2 postn = new Zip2("postnummer.csv");
        // postn.collisions(11000);
        // postn.collisions(10679);
        // postn.collisions(12000);
        // postn.collisions(11587);
        // postn.collisions(15000);
        // postn.collisions(14449);
        // postn.collisions(20000);
        // postn.collisions(19991);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // to benchmark hashtable vs zip 2
        // Zip2 postn2 = new Zip2("postnummer.csv");
        // hashTable postn3 = new hashTable("postnummer.csv", 11587);
        // int loop = 100;
        // System.out.printf("------------------------------------------------------------------------------------------------\n");
        // System.out.printf("%-23s %-23s  %-23s %-10s\n", "111 15 Binary" , "994 99 Binary", "111 15 Constant" , "994 99 Constant");
        // System.out.printf("-------------------------------------------------------------------------------------------------\n");
        // double minTB1 = Double.MAX_VALUE;
        // double minTB2 = Double.MAX_VALUE;
        // double minTC1 = Double.MAX_VALUE;
        // double minTC2 = Double.MAX_VALUE;

        // for(int i=0; i<loop; i++){

        //     double t0 = System.nanoTime();
        //     postn2.lookup(11115);
        //     double t1 = System.nanoTime();

        //     double t_B1 = (t1 - t0);
        //     if(t_B1 < minTB1){
        //         minTB1 = t_B1;
        //     }


        //     double t2 = System.nanoTime();
        //     postn2.lookup(99499);
        //     double t3 = System.nanoTime();

        //     double t_B2 = (t3 - t2);
        //     if(t_B2 < minTB2){
        //         minTB2 = t_B2;
        //     }

        //     double t4 = System.nanoTime();
        //     postn3.lookup(11115);
        //     double t5 = System.nanoTime();

        //     double t_C1 = (t5 - t4);
        //     if(t_C1 < minTC1){
        //         minTC1 = t_C1;
        //     }

        //     double t6 = System.nanoTime();
        //     postn3.lookup(99499);
        //     double t7 = System.nanoTime();

        //     double t_C2 = (t7 - t6);
        //     if(t_C2 < minTC2){
        //         minTC2 = t_C2;
        //     }

        // }
       
        // System.out.println((long)minTB1 + "ns" + " \t\t\t" + (long)minTB2 + " ns." + " \t\t\t" + (long)minTC1 + "ns" + "\t\t\t" + (long)minTC2 + " ns.");
        // System.out.printf("-------------------------------------------------------------------------------------------\n");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // to see how many elements should program go through in a lookup in respective method(with bucket vs without bucket)
            int[] size = {10067, 11587, 15331, 21269};

            for(int i=0; i<size.length; i++){
                
                hashTable ht = new hashTable("postnummer.csv", size[i]);
                System.out.println("Size: " + size[i] +"\tWith bucket:");
                System.out.println(ht.lookup(99499) + "\t Have been looked at " + ht.comparison + " elements.");
                System.out.println(ht.lookup(53151) + "\t Have been looked at " + ht.comparison + " elements.");
               // System.out.println(ht.lookup(11115) + "\t Have been looked at " + ht.comparison + " elements.");
                //System.out.println(ht.lookup(12156) + "\t Have been looked at " + ht.comparison + " elements.");
                System.out.println(ht.lookup(44696) + "\t Have been looked at " + ht.comparison + " elements.");
                System.out.println(ht.lookup(70224) + "\t Have been looked at " + ht.comparison + " elements.");
                
                hashTable2 htbl = new hashTable2("postnummer.csv", size[i]);
                System.out.println("\n\nSize: " + size[i] + "\tWithout bucket:");
                System.out.println(htbl.lookup(99499) + "\t Have been looked at " + htbl.comparison + " elements.");
                System.out.println(htbl.lookup(53151) + "\t Have been looked at " + htbl.comparison + " elements.");
                //System.out.println(htbl.lookup(11115) + "\t Have been looked at " + htbl.comparison + " elements.");
                //System.out.println(htbl.lookup(12156) + "\t Have been looked at " + htbl.comparison + " elements.");
                System.out.println(htbl.lookup(44696) + "\t Have been looked at " + htbl.comparison + " elements.");
                System.out.println(htbl.lookup(70224) + "\t Have been looked at " + htbl.comparison + " elements.");
                System.out.println("--------------------------------------------------------------------------------");
            }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                // To compare execution time in an array with bucket and without bucket
                // hashTable2 postn2 = new hashTable2("postnummer.csv", 11587);
                // hashTable postn3 = new hashTable("postnummer.csv", 11587);
                // int loop = 100;
                // System.out.printf("------------------------------------------------------------------------------------------------\n");
                // System.out.printf("%-23s %-23s  %-23s %-10s\n", "111 15 without B" , "994 99 without B", "111 15 with B" , "994 99 with B");
                // System.out.printf("-------------------------------------------------------------------------------------------------\n");
                // double minTB1 = Double.MAX_VALUE;
                // double minTB2 = Double.MAX_VALUE;
                // double minTC1 = Double.MAX_VALUE;
                // double minTC2 = Double.MAX_VALUE;
        
                // for(int i=0; i<loop; i++){
        
                //     double t0 = System.nanoTime();
                //     postn2.lookup(11115);
                //     double t1 = System.nanoTime();
        
                //     double t_B1 = (t1 - t0);
                //     if(t_B1 < minTB1){
                //         minTB1 = t_B1;
                //     }
        
        
                //     double t2 = System.nanoTime();
                //     postn2.lookup(99499);
                //     double t3 = System.nanoTime();
        
                //     double t_B2 = (t3 - t2);
                //     if(t_B2 < minTB2){
                //         minTB2 = t_B2;
                //     }
        
                //     double t4 = System.nanoTime();
                //     postn3.lookup(11115);
                //     double t5 = System.nanoTime();
        
                //     double t_C1 = (t5 - t4);
                //     if(t_C1 < minTC1){
                //         minTC1 = t_C1;
                //     }
        
                //     double t6 = System.nanoTime();
                //     postn3.lookup(99499);
                //     double t7 = System.nanoTime();
        
                //     double t_C2 = (t7 - t6);
                //     if(t_C2 < minTC2){
                //         minTC2 = t_C2;
                //     }
        
                // }
               
                // System.out.println((long)minTB1 + "ns" + " \t\t\t" + (long)minTB2 + " ns." + " \t\t\t" + (long)minTC1 + "ns" + "\t\t\t" + (long)minTC2 + " ns.");
                // System.out.printf("-------------------------------------------------------------------------------------------\n");

            }
    }

