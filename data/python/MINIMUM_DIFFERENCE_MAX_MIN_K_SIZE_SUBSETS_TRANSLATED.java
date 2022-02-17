====================
public static int fGold ( int [ ] arr , int N , int K ) {
  Arrays . sort ( arr ) ;
  int res = 2147483647 ;
  for ( int i = 0 ;
  i < ( N - K ) + 1 ;
  i ++ ) {
    int curSeqDiff = arr [ i + K - 1 ] - arr [ i ] ;
    res = Math . min ( res , curSeqDiff ) ;
  }
  return res ;
}

