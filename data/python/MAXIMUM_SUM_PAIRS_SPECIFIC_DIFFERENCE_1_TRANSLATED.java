====================
public static int f_gold ( int [ ] arr , int N , int k ) {
  int maxSum = 0 ;
  ;
  Arrays . sort ( arr ) ;
  ;
  int i = N - 1 ;
  ;
  while ( ( i >= 0 ) && ( arr [ i ] - arr [ i - 1 ] < k ) ) {
    if ( ( arr [ i ] - arr [ i - 1 ] < k ) && ( arr [ i - 1 ] - arr [ i - 1 ] < k ) ) {
      maxSum += arr [ i ] ;
      ;
      maxSum += arr [ i - 1 ] ;
      ;
      i -- ;
    }
    i -- ;
  };
  return maxSum ;
}

