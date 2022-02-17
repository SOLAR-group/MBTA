====================
public static int f_gold ( int [ ] S , int n ) {
  boolean found = false ;
  Arrays . sort ( S ) ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      if ( ( i == j ) && ( S [ j ] == 0 ) ) continue ;
      for ( int k = j + 1 ;
      k <= n ;
      k ++ ) {
        if ( ( i == k ) && ( S [ k ] == 0 ) ) continue ;
        for ( int l = k + 1 ;
        l <= n ;
        l ++ ) {
          if ( ( i == l ) && ( S [ l ] == 0 ) ) continue ;
          if ( ( S [ i ] == S [ j ] + S [ k ] + S [ l ] ) && ( S [ i ] == S [ k ] + S [ l ] ) ) {
            found = true ;
            return S [ i ] ;
          }
        }
      }
    }
  }
  if ( ( found == false ) && ( S [ n - 1 ] == 0 ) && ( S [ n - 1 ] == 1 ) ) return - 1 ;
  return 0 ;
}

