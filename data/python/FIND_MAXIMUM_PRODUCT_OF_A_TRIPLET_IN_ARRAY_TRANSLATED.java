====================
static int f_gold ( int [ ] arr , int n ) {
  if ( n < 3 ) return - 1 ;
  int maxProduct = - ( Integer . MAX_VALUE - 1 ) ;
  for ( int i = 0 ;
  i <= n - 2 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= n - 1 ;
    j ++ ) {
      for ( int k = j + 1 ;
      k <= n ;
      k ++ ) {
        maxProduct = Math . max ( maxProduct , arr [ i ] * arr [ j ] * arr [ k ] ) ;
      }
    }
  }
  return maxProduct ;
}

