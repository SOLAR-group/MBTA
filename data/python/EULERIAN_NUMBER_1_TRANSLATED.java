====================
public static int f_gold ( int n , int m ) {
  int [ ] [ ] dp = new int [ m + 1 ] [ n + 1 ] ;
  for ( int y = 0 ;
  y < n ;
  y ++ ) {
    dp [ y ] [ y ] = 0 ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j <= m ;
    j ++ ) {
      if ( ( i > j ) && ( j == 0 ) ) {
        if ( ( j == 0 ) || ( j == 1 ) ) {
          dp [ i ] [ j ] = 1 ;
        }
        else {
          dp [ i ] [ j ] = ( ( ( i - j ) * dp [ i - 1 ] [ j - 1 ] ) + ( ( j + 1 ) * dp [ i - 1 ] [ j ] ) ) ;
        }
      }
    }
  }
  return dp [ n ] [ m ] ;
}

