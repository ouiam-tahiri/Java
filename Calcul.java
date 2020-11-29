import  java.util.Scanner ;

public  class  Calcul {
    public  static  void  main ( String [] args ) {
        int a, b, s;
        Scanner sc =  nouveau  scanner ( System . In );
        Système . dehors . println ( " taper les deux nombres " );
        a = sc . nextInt ();
        b = sc . nextInt ();
        char o;
        // Scanner scn = nouveau Scanner (System.in);
        Système . dehors . println ( " taper un operation " );
        o = sc . suivant () . charAt ( 0 );
        si (o ==  ' + ' ) {
            s = a + b;
			Système . dehors . println (a + "  " + o + "  " + b + " = " + s);
        }
		sinon  si (o == ' - ' ) {
			s = a - b;
			Système . dehors . println (a + "  " + o + "  " + b + " = " + s);
		}
		sinon  si (o == ' * ' ) {
			s = a * b;
			Système . dehors . println (a + "  " + o + "  " + b + " = " + s);
		}
		sinon  si (o == ' / ' ) {
			s = a / b;
			Système . dehors . println (a + "  " + o + "  " + b + " = " + s);
		}
		else { System . dehors . println ( " erreur " );}

    }


}
