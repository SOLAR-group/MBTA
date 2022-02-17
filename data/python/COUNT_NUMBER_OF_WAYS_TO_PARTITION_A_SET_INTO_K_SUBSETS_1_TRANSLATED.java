====================
public static int f_gold ( int n , int k ) {
  int [ ] [ ] dp = new int [ k + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dp [ i ] [ 0 ] = 0 ;
  }
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    dp [ 0 ] [ k ] = 0 ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= k ;
    j ++ ) {
      if ( ( j == 1 || i == j ) && ( dp [ i ] [ j ] == 0 ) ) {
        dp [ i ] [ j ] = 1 ;
      }
      else {
        dp [ i ] [ j ] = ( j * dp [ i - 1 ] [ j ] + dp [ i - 1 ] [ j - 1 ] ) ;
      }
    }
  }
  return dp [ n ] [ k ] ;
}

