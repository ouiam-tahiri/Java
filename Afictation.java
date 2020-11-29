import  java.util.Scanner ;

public  class  Afictation {

    public  static  void  main ( String [] args ) {
		int a, b, c =  0 ;
        Scanner sc =  nouveau  scanner ( System . In );
        Système . dehors . println ( " taper le nombre a " );
        a = sc . nextInt ();
        Système . dehors . println ( " taper le nombre b " );
        b = sc . nextInt ();
        Système . dehors . println ( " les nombre avant permutation est: " );
        Système . dehors . println ( " a = " + a + " \ n b = " + b);
        Système . dehors . println ( " les nombre après permutation est: " );
        c = a;
        a = b;
        b = c;
        Système . dehors . println ( " a = " + a + " \ n b = " + b);
	}
} 
