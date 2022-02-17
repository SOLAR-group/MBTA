====================
public static int f_gold ( int N , int insrt , int remov , int cpy ) {
  if ( N == 0 ) return 0 ;
  if ( N == 1 ) return insrt ;
  int [ ] dp = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( i % 2 == 0 ) dp [ i ] = Math . min ( dp [ i - 1 ] + insrt , dp [ i / 2 ] + cpy ) ;
    else dp [ i ] = Math . min ( dp [ i - 1 ] + insrt , dp [ ( i + 1 ) / 2 ] + cpy + remov ) ;
  }
  return dp [ N ] ;
}

