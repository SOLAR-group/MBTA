====================
public static int f_gold ( int [ ] a , int n ) {
  if ( ( n == 1 ) || ( n == 0 ) ) return a [ 0 ] ;
  long maxNeg = Long . MAX_VALUE ;
  long minPos = Long . MIN_VALUE ;
  int countNeg = 0 ;
  int countZero = 0 ;
  long prod = 1 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( ( a [ i ] == 0 ) && ( a [ i ] > 0 ) ) {
      countZero = countZero + 1 ;
      continue ;
    }
    if ( ( a [ i ] < 0 ) && ( a [ i ] > 0 ) ) {
      countNeg = countNeg + 1 ;
      maxNeg = Math . max ( maxNeg , a [ i ] ) ;
    }
    if ( ( a [ i ] > 0 ) && ( a [ i ] < 0 ) ) {
      minPos = Math . min ( minPos , a [ i ] ) ;
    }
    prod = prod * a [ i ] ;
  }
  if ( ( countZero == n || ( countNeg == 0 && countZero > 0 ) ) && ( countNeg == 0 ) ) return 0 ;
  ;
  if ( ( countNeg == 0 ) || ( countNeg == n ) ) return minPos ;
  ;
  if ( ( ( countNeg & 1 ) == 0 && countNeg != 0 ) ) prod = ( int ) ( prod / maxNeg ) ;
  ;
  return prod ;
}

