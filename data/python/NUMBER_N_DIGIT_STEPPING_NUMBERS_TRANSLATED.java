====================
public static int f_gold ( int n ) {
  int [ ] [ ] dp = new int [ 10 ] [ n + 1 ] ;
  for ( int y = 0 ;
  y < n ;
  y ++ ) {
    dp [ y ] [ y ] = 0 ;
  };
  if ( ( n == 1 ) && ( n > 0 ) ) return 10 ;
  ;
  for ( int j = 0 ;
  j < 10 ;
  j ++ ) dp [ 1 ] [ j ] = 1 ;
  ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j < 10 ;
    j ++ ) {
      if ( ( j == 0 ) && ( j > 0 ) ) dp [ i ] [ j ] = dp [ i - 1 ] [ j + 1 ] ;
      else if ( ( j == 9 ) && ( j > 0 ) ) dp [ i ] [ j ] = dp [ i - 1 ] [ j - 1 ] ;
      else dp [ i ] [ j ] = ( dp [ i - 1 ] [ j - 1 ] + dp [ i - 1 ] [ j + 1 ] ) ;
      ;
    }
  }
  int sum = 0 ;
  ;
  for ( int j = 1 ;
  j <= 10 ;
  j ++ ) sum = sum + dp [ n ] [ j ] ;
  ;
  return sum ;
}

