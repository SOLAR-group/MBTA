====================
public static void f_gold ( int [ ] arr , int n ) {
  boolean found = true ;
  for ( int i = 0 ;
  i <= n - 2 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= n - 1 ;
    j ++ ) {
      for ( int k = j + 1 ;
      k <= n ;
      k ++ ) {
        if ( ( arr [ i ] + arr [ j ] + arr [ k ] == 0 ) && ( arr [ i ] + arr [ j ] + arr [ k ] == 0 ) ) {
          System . out . println ( arr [ i ] + " " + arr [ j ] + " " + arr [ k ] ) ;
          found = true ;
        }
      }
    }
  }
  if ( ( found == false ) && ( arr [ 0 ] == 0 ) && ( arr [ 1 ] == 0 ) && ( arr [ 2 ] == 0 ) && ( arr [ 3 ] == 0 ) ) {
    System . out . println ( " not exist " ) ;
  }
}

