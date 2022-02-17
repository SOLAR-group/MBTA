====================
public static int f_gold ( int [ ] a , int size ) {
  int maxSoFar = a [ 0 ] ;
  int currMax = a [ 0 ] ;
  for ( int i = 1 ;
  i < size ;
  i ++ ) {
    currMax = Math . max ( a [ i ] , currMax + a [ i ] ) ;
    maxSoFar = Math . max ( maxSoFar , currMax ) ;
  }
  return maxSoFar ;
}

