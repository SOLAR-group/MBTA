====================
public static int fGold ( int m , int n , int x ) {
  int [ ] [ ] table = new int [ n + 1 ] [ m + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) table [ i ] [ i ] = 0 ;
  for ( int j = 1 ;
  j <= Math . min ( m + 1 , x + 1 ) ;
  j ++ ) table [ 1 ] [ j ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= x ;
    j ++ ) {
      for ( int k = 1 ;
      k <= Math . min ( m + 1 , j ) ;
      k ++ ) table [ i ] [ j ] += table [ i - 1 ] [ j - k ] ;
    }
  }
  return table [ table . length - 1 ] [ - 1 ] ;
}

