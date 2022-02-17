====================
public static final int fGold ( int n ) {
  int maxPrime = - 1 ;
  while ( n % 2 == 0 ) {
    maxPrime = 2 ;
    n >>>= 1 ;
  }
  for ( int i = 3 ;
  i <= Integer . MAX_VALUE ;
  i ++ ) {
    while ( n % i == 0 ) {
      maxPrime = i ;
      n = n / i ;
    }
  }
  if ( n > 2 ) {
    maxPrime = n ;
  }
  return ( int ) maxPrime ;
}

