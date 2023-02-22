public class Naive {
    public static void main(String[] args) {
        //journey("Malmö", "Göteborg", 300);
        //journey( "Göteborg", "Stockholm", 220);
        //journey( "Malmö", "Stockholm", 300);
        // journey( "Stockholm","Sundsvall", 400);
        // journey( "Stockholm","Umeå", 700);
        // journey( "Göteborg", "Sundsvall", 600); // 515 ms (98982 ms)
        //journey( "Sundsvall","Umeå", 200);
        journey( "Umeå","Göteborg", 800);
        // journey( "Göteborg","Umeå", 800);
       

        //journey( "Malmö","Lund", 100);
        


/////////////////////////////////////////////////////////
        // Map map = new Map("trains.csv");
        // City c = map.lookup("Lund");
        // for(int i=0; i<c.neighbors.length; i++){
        //     if(c.neighbors[i] != null)
        //         System.out.println(c.neighbors[i].city.name +" ("+ c.neighbors[i].dist+")" );
        // }
//////////////////////////////////////////////////////////////
    }



    private static void journey(String fr, String t, int m){
        Map map = new Map("trains.csv");

        // String from = fr;
        // String to = t;
        // Integer max = m;

        long t0 = System.nanoTime();
        Integer dist = shortest(map.lookup(fr), map.lookup(t), m);
        long time = (System.nanoTime() - t0)/1_000_000;

        if(dist == null){
            System.out.println("NOT FOUND! Increase the max!");
        }
        else{

            System.out.println("shorest: " + dist + " min (" + time + " ms)");
        }
    }


    
    private static Integer shortest(City from, City to, Integer max) {
        if (max < 0)
            return null;
        if (from == to)
            return 0;
        Integer shrt = null;
        for (int i = 0; i < from.neighbors.length; i++) {
            if (from.neighbors[i] != null) {
                Connection conn = from.neighbors[i];
                Integer dist = shortest(conn.city,to, max-conn.dist);
                if((dist != null) && ((shrt == null) || (shrt > dist + conn.dist))){
                    shrt = dist + conn.dist;
                }
                // if((shrt != null) && (max > shrt)){
                //     // System.out.println("max from " + from.name + "set to " + shrt);
                //     max = shrt;
                // }
            }
        }
        return shrt;
    }
}
