import  java.util.Scanner ;

public  class  Pair_Impaire {

    public  static  void  main ( String [] args ) {
		int x;
        Scanner sc =  nouveau  scanner ( System . In );
        Système . dehors . println ( " Entrer un nombre entier " );
        x = sc . nextInt ();
        si (x % 2 == 0 ) {
            Système . dehors . println ( " le nombre x = " + x + " est paire " );
        }
        else {
            Système . dehors . println ( " le nombre x = " + x + " est impaire " );
        }
	}
} 
