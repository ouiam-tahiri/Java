import  java.util.Scanner ;
 Opération de classe  publique {
    public  static  void  main ( String [] args ) {
        int a, b, s, r;
        Scanner sc =  nouveau  scanner ( System . In );
        Système . dehors . println ( " taper le nombre a " );
        a = sc . nextInt ();
        Système . dehors . println ( " taper le nombre b " );
        b = sc . nextInt ();
        s = a + b;
        Système . dehors . println ( " la somme de deux nombre " + a + " et " + b + " est " + s);
        s = a - b;
        Système . dehors . println ( " la différence entre " + a + " et " + b + " est " + s);
        s = a * b;
        Système . dehors . println ( " le produit de deux nombre " + a + " et " + b + " est " + s);
        s = a / b;
        Système . dehors . println ( " le quotient de deux nombre " + a + " et " + b + " est " + s);
        r = a % b;
        Système . dehors . println ( " le reste de la division entre " + a + " et " + b + " est " + r);


    }

} 
