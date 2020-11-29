import  java.util.Scanner ;

public  class  Methode {
    statique  int n1, n2;
    public  static  void  main ( String [] args ) {
        lire ();
        additionneur (n1, n2);
    }
    public  static  void  additionneur ( int  n1 , int  n2 ) {
        int somme;
        somme = n1 + n2;
        Système . dehors . println ( " la somme entre " + n1 + " et " + n2 + " est: " + somme);
    }
    public  static  void  lire () {
        // int n3, n4;
        Scanner sc =  nouveau  scanner ( System . In );
        Système . dehors . println ( " cône deux nombre " );
        n1 = sc . nextInt ();
        n2 = sc . nextInt ();
    }


}
