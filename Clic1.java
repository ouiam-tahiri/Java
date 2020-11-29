import  javax.swing. * ; // verser JFrame
import  java.awt.event. * ; // pour MouseEvent et MouseListener
class  MaFenetre  étend  JFrame  implémente  MouseListener
{ public  MaFenetre () // constructeur
{setTitle ( " Gestion de clics " );
setBounds ( 20 , 30 , 1000 , 1000 );
addMouseListener ( this ); // la fenetre sera son propre écouteur
// événements souris
}
public  void  mouseClicked ( MouseEvent  ev ) // méthode gerant un clic souris
{ Système . dehors . println ( " clic dans fenetre " );
}
public  void  mousePressed ( MouseEvent  ev ) {}
public  void  mouseReleased ( MouseEvent  ev ) {}
public  void  mouseEntered ( MouseEvent  ev ) {}
public  void  mouseExited ( MouseEvent  ev ) {}
}
 classe  publique Clic1
{ public  static  void  main ( String  args [])
{ MaFenetre fen =  nouveau  MaFenetre ();
fen . setVisible ( vrai );
}
} 
