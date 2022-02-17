====================
public static final double fGoldenN ( int n ) {
  double res = 1 ;
  while ( n % 2 == 0 ) n = n / 2 ;
  for ( int i = 3 ;
  i <= ( int ) Math . sqrt ( n ) + 1 ;
  i ++ ) {
    int count = 0 ;
    double currSum = 1 ;
    double currTerm = 1 ;
    while ( n % i == 0 ) {
      count ++ ;
      n = n / i ;
      currTerm *= i ;
      currSum += currTerm ;
    }
    res *= currSum ;
  }
  if ( n >= 2 ) res *= ( 1 + n ) ;
  return res ;
}

