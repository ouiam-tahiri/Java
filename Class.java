public  class  Verre {
    Matière à cordes ;
    String boissant;
    int capacite;
    int capacitemax;

    void  afficher_les_info () {
        Système . dehors . println ( " la matier de ce verre est " + matiere);
        Système . dehors . println ( " la boissant de ce verre est " + boissant);
        Système . dehors . println ( " la capacite de ce verre est " + capacite);
        Système . dehors . println ( " la capacitemax de ce verre est " + capacitemax + " \ n \ n " );
    }

    void  vider_verre () {
        capacite - = 5 ;
    }

    void  remplir_verre () {
        capacite + = 10 ;
    }
}
 classe  publique Classe {

    public  static  void  main ( String [] args ) {
        Verre verre =  nouveau  Verre ();
        verre . matiere =  " Bois " ;
        verre . boissant =  " Eau " ;
        verre . capacite =  30 ;
        verre . capacitemax =  50 ;
        verre . afficher_les_info ();
        verre . remplir_verre ();
        verre . afficher_les_info ();
        verre . vider_verre ();
        verre . afficher_les_info ();
    }

}
