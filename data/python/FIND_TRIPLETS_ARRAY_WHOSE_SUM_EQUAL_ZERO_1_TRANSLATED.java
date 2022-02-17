====================
public static void f_gold ( int [ ] arr , int n ) {
  boolean found = false ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    HashSet s = new HashSet ( ) ;
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      int x = - ( arr [ i ] + arr [ j ] ) ;
      if ( x < s . size ( ) ) {
        System . out . println ( x + " " + arr [ i ] + " " + arr [ j ] ) ;
        found = true ;
      }
      else {
        s . add ( arr [ j ] ) ;
      }
    }
  }
  if ( found == false ) {
    System . out . println ( "No Triplet Found" ) ;
  }
}

