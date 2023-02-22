public class Paths {
    City[] path;
    int sp;
    public Paths() {
        path = new City[54];
        sp = 0;
    }


    private static void trip(String fr, String t, Integer m){
        Map map = new Map("trains.csv");
        Paths path = new Paths();

        String from = fr;
        String to = t;
        Integer max = m;

        long t0 = System.nanoTime();
        Integer dist = path.shortest(map.lookup(from), map.lookup(to), max);
        long time = (System.nanoTime() - t0)/1_000_000;

        if(dist == null){
            System.out.println("NOT FOUND! Increase the max!");
        }
        else{

            System.out.println("shorest: " + dist + " min (" + time + " ms)");
        }

    }

    

    private Integer shortest(City from, City to, Integer max) {
        if (max < 0)
            return null;

        if (from == to)
            return 0;  

        // preventing loops by using paths
        for (int i = 0; i < sp; i++) {
            if (path[i] == from)
            return null;
        }
        path[sp++] = from;

        Integer shrt = null;
        for (int i = 0; i < from.neighbors.length; i++) {
            if (from.neighbors[i] != null) {
                Connection conn = from.neighbors[i];
                Integer dist = shortest(conn.city,to, max-conn.dist);
                //Integer dist = shortest(conn.city,to, max);
                if((dist != null) && ((shrt == null) || (shrt > dist + conn.dist))){
                    shrt = dist + conn.dist;
                }
                if((shrt != null) && (max > shrt)){
                    //System.out.println("max " + max);
                    //System.out.println("max from " + from.name + " set to " + shrt);
                    max = shrt;
                }
                // if(shrt != null){
                //     //System.out.println("max " + max);
                //     //System.out.println("max from " + from.name + " set to " + shrt);
                //     max = shrt;
                // }
            }   
        }   
        path[sp--] = null;

        return shrt;
    }




    public static void main(String[] args) {
        // trip("Malmö", "Göteborg", 300);
        // trip( "Göteborg", "Stockholm", 220);
        // trip( "Malmö", "Stockholm", 300);
       // trip( "Stockholm","Sundsvall", 400);
        //trip( "Stockholm","Umeå", 600); // 517 min (12 ms)
        // trip( "Göteborg", "Sundsvall", 600); // 515 min (22 ms)
        // trip( "Sundsvall","Umeå", 200);
        // trip( "Umeå","Göteborg", 800);
        //trip( "Göteborg","Umeå", 800);
        
        trip( "Malmö","Kiruna", 12000); // 1162 min (1294 ms) without improvement
        
    } 
} 

