====================
static int fGold ( int [ ] arr , int n ) {
  int res = - Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    int currSum = 0 ;
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      int index = ( int ) ( ( i + j ) % n ) ;
      currSum += j * arr [ index ] ;
    }
    res = Math . max ( res , currSum ) ;
  }
  return res ;
}

