====================
public static int f_gold ( int [ ] arr , int n ) {
  int cumSum = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    cumSum += arr [ i ] ;
  }
  int currVal = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    currVal += i * arr [ i ] ;
  }
  int res = currVal ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int nextVal = ( currVal - ( cumSum - arr [ i - 1 ] ) + arr [ i - 1 ] * ( n - 1 ) ) ;
    currVal = nextVal ;
    res = Math . max ( res , nextVal ) ;
  }
  return res ;
}

