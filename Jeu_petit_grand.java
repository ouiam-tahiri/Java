import  java.util.Random ;
import  java.util.Scanner ;

 classe  publique Jeu_petit_grand {

    public  static  void  main ( String [] args ) {
        int a, n, i = 0 ;
        Scanner sc =  nouveau  scanner ( System . In );
        Random r =  nouveau  Random ();
        a = r . nextInt ( 100 );
        Système . dehors . println ( " cône un nombre " );
        // n = sc.nextInt ();
        faire {
            i ++ ;
            n = sc . nextInt ();
            si (n > a)
            Système . dehors . println ( " Votre nombre est plus petit " );
            sinon  si (n < a)
            Système . dehors . println ( " Votre nombre est plus grand " );
            autre
            Système . dehors . println ( " Bravo vous avez trouvé le nombre en " + i + " tentatives " );
        } tandis que (n ! = a);

    }

} 
