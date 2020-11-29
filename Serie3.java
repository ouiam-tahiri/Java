import  java.util.Scanner ;

public  class  Serie3 {
    public  static  void  main ( String [] args ) {
        int a, b, s;
        Scanner sc =  nouveau  scanner ( System . In );
        Système . dehors . println ( " taper le premier nombre " );
        a = sc . nextInt ();
        char o;
        // Scanner scn = nouveau Scanner (System.in);
        Système . dehors . println ( " taper un operation " );
        o = sc . suivant () . charAt ( 0 );
        Système . dehors . println ( " taper la deuieme nombre " );
        b = sc . nextInt ();

        si (o ==  ' + ' ) {
            s = a + b;
            Système . dehors . println ( " s = " + a + " + " + b + " = " + s);
        }
        sinon  si (o ==  ' - ' ) {
            s = a - b;
            Système . dehors . println ( " s = " + a + " - " + b + " = " + s);
        }
        sinon  si (o ==  ' * ' ) {
            s = a * b;
            Système . dehors . println ( " s = " + a + " * " + b + " = " + s);
        }
        sinon  si (o ==  ' / ' ) {
            s = a / b;
            Système . dehors . println ( " s = " + a + " * " + b + " = " + s);
        }
        else {
            Système . dehors . println ( " erreur " );
        }


    }


}
