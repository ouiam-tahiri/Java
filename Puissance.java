import  java.util.Scanner ;

 Classe  publique Puissance {

    public  static  void  main ( String [] args ) {

        int n, s = 1 , p;
        Scanner sc =  nouveau  scanner ( System . In );
        Système . dehors . println ( " cône un nombre " );
        n = sc . nextInt ();
        Système . dehors . println ( " cône la puissance de ce nombre " );
        p = sc . nextInt ();
        pour ( int i = 0 ; i < p; i ++ ) {
            s = s * n;
            // i ++;
        }
        Système . dehors . println (n + " ^ " + p + " = " + s);
    }

} 
