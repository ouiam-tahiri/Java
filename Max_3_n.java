import  java.util.Scanner ;

 classe  publique Max_3_n {

    public  static  void  main ( String [] args ) {
		double f, g, h, max;
        Scanner sc =  nouveau  scanner ( System . In );
        Système . dehors . println ( " Entrer un nombre réele " );
        f = sc . nextDouble ();
        Système . dehors . println ( " Entrer un nombre réele " );
        g = sc . nextDouble ();
        Système . dehors . println ( " Entrer un nombre réele " );
        h = sc . nextDouble ();
        max = f;
        si (f < g) {
            max = g;
        }
        if (h > max) {
            max = h;
        }
        Système . dehors . println ( " \ n " + max + " est le nombre maximum " );

	}
} 
