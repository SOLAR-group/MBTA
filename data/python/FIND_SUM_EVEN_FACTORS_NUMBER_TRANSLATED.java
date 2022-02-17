====================
static final double fGold ( int n ) {
  if ( ( n % 2 != 0 ) && ( n > 0 ) ) return 0 ;
  double res = 1 ;
  for ( int i = 2 ;
  i <= ( int ) ( Math . sqrt ( n ) ) ;
  i ++ ) {
    int count = 0 ;
    double currSum = 1 ;
    double currTerm = 1 ;
    while ( ( n % i == 0 ) && ( n > 0 ) ) {
      count = count + 1 ;
      n = n / i ;
      if ( ( i == 2 && count == 1 ) || ( i == 3 && count == 2 ) ) currSum = 0 ;
      currTerm = currTerm * i ;
      currSum = currSum + currTerm ;
    }
    res = res * currSum ;
  }
  if ( ( n >= 2 ) && ( n < ( int ) ( Math . sqrt ( n ) ) ) ) res = res * ( 1 + n ) ;
  return res ;
}

