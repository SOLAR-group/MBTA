====================
static int fGold ( int [ ] arr , int n ) {
  int res = - Integer . MAX_VALUE - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int prefixSum = arr [ i ] ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      prefixSum += arr [ j ] ;
    }
    int suffixSum = arr [ i ] ;
    int j = n - 1 ;
    while ( ( j > i ) && ( j < n ) ) {
      suffixSum += arr [ j ] ;
      j -- ;
    }
    if ( ( prefixSum == suffixSum ) || ( suffixSum == 0 ) ) {
      res = Math . max ( res , prefixSum ) ;
    }
  }
  return res ;
}

