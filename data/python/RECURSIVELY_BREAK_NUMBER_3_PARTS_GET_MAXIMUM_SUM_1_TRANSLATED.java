====================
public static int f_gold ( int n ) {
  int [ ] dp = new int [ n + 1 ] ;
  dp [ 0 ] = 0 ;
  dp [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    dp [ i ] = Math . max ( dp [ ( int ) ( i / 2 ) ] + dp [ ( int ) ( i / 3 ) ] + dp [ ( int ) ( i / 4 ) ] , i ) ;
    ;
  }
  return dp [ n ] ;
}

