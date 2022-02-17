====================
public static int f_gold ( int [ ] arr , int n ) {
  int result = 0 ;
  HashSet < Integer > Hash = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) Hash . add ( arr [ i ] ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      int product = arr [ i ] * arr [ j ] ;
      if ( product == ( Hash . size ( ) - 1 ) ) result ++ ;
    }
  }
  return result ;
}

