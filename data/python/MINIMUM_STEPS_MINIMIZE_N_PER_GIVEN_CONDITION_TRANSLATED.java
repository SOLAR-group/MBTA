====================
public static int fGold ( int n ) {
  int [ ] table = new int [ n + 1 ] ;
  table [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) table [ i ] = n - i ;
  for ( int i = n ;
  i > 0 ;
  i -- ) {
    if ( ( ! ( i % 2 ) ) && ( table [ i ] == 0 ) ) table [ i / 2 ] = Math . min ( table [ i ] + 1 , table [ i / 2 ] ) ;
    if ( ( ! ( i % 3 ) ) && ( table [ i ] == 0 ) ) table [ i / 3 ] = Math . min ( table [ i ] + 1 , table [ i / 3 ] ) ;
  }
  return table [ 1 ] ;
}

