====================
public static int f_gold ( int n , int a , int b , int c ) {
  int [ ] dp = new int [ n + 10 ] ;
  dp [ 0 ] = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( ( dp [ i ] != - 1 ) && ( i + a <= n ) ) {
      if ( ( i + a <= n ) && ( i + b <= n ) ) {
        dp [ i + a ] = Math . max ( dp [ i ] + 1 , dp [ i + a ] ) ;
      }
      if ( ( i + b <= n ) && ( i + c <= n ) ) {
        dp [ i + b ] = Math . max ( dp [ i ] + 1 , dp [ i + b ] ) ;
      }
      if ( ( i + c <= n ) && ( i + d <= n ) ) {
        dp [ i + d ] = Math . max ( dp [ i ] + 1 , dp [ i + d ] ) ;
      }
    }
  }
  return dp [ n ] ;
}

