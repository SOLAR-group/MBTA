====================
static final long fGold ( long [ ] a , int n ) {
  long mn = Long . MAX_VALUE ;
  long sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    mn = Math . min ( a [ i ] , mn ) ;
    sum += a [ i ] ;
  }
  return mn * ( sum - mn ) ;
}

