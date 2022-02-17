====================
public static int f_gold ( int n ) {
  int [ ] [ ] dp = new int [ 27 ] [ n + 1 ] ;
  for ( int j = 0 ;
  j <= n ;
  j ++ ) dp [ j ] [ j ] = 0 ;
  for ( int i = 0 ;
  i <= 26 ;
  i ++ ) dp [ 1 ] [ i ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j <= 26 ;
    j ++ ) {
      if ( ( j == 0 ) || ( j == 1 ) ) dp [ i ] [ j ] = dp [ i - 1 ] [ j + 1 ] ;
      ;
      else dp [ i ] [ j ] = ( dp [ i - 1 ] [ j - 1 ] + dp [ i - 1 ] [ j + 1 ] ) ;
    }
  }
  int sum = 0 ;
  for ( int i = 0 ;
  i <= 26 ;
  i ++ ) sum = sum + dp [ n ] [ i ] ;
  return sum ;
}

