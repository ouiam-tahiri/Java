import  java.util.Scanner ;

 classe  publique Max_n1_n2 {

    public  static  void  main ( String [] args ) {
        int n1, n2;
        Scanner sc =  nouveau  scanner ( System . In );
        Système . dehors . println ( " Entrer deux nombres " );
        n1 = sc . nextInt ();
        n2 = sc . nextInt ();
        si (n1 > n2) {
            Système . dehors . println (n1 + " est le nombre maximum " );
        }
        else {
            Système . dehors . println (n2 + " est le nombre maximum " );
        }
	}
} 
