====================
public static void f_gold ( int [ ] XY , int n , int Xmin , int Ymin , int Xmax , int Ymax ) {
  System . out . println ( "Point inside the viewing pane:" ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( ( XY [ i ] . x >= Xmin ) && ( XY [ i ] . x <= Xmax ) ) || ( ( XY [ i ] . y >= Ymin ) && ( XY [ i ] . y <= Ymax ) ) ) {
      if ( ( ( XY [ i ] . y >= Ymin ) && ( XY [ i ] . y <= Ymax ) ) || ( ( XY [ i ] . x >= Xmin ) && ( XY [ i ] . x <= Xmax ) ) ) {
        System . out . println ( "[" + XY [ i ] . x + ", " + XY [ i ] . y + "]" + " " + "[" + XY [ i ] . x + ", " + XY [ i ] . y + "]" + " " + "[" + XY [ i ] . x + ", " + XY [ i ] . y + "]" + " " + "[" + XY [ i ] . x + ", " + XY [ i ] . y + "]" + " " + "[" + XY [ i ] . x + ", " + XY [ i ] . y + "]" + " " + "]" ) ;
      }
    }
  }
  System . out . println ( "\n\nPoint outside the viewing pane:" ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( ( XY [ i ] . x < Xmin ) || ( XY [ i ] . x > Xmax ) ) ) {
      System . out . println ( "[" + XY [ i ] . x + ", " + XY [ i ] . y + "]" + " " + "[" + XY [ i ] . x + ", " + XY [ i ] . y + "]" + " " + "[" + XY [ i ] . x + ", " + XY [ i ] . y + "]" + " SPACETOKEN
