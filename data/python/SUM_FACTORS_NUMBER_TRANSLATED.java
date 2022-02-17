====================
public static final int fGold ( int n ) {
  int result = 0 ;
  for ( int i = 2 ;
  i <= ( int ) ( Math . sqrt ( n ) ) ;
  i ++ ) {
    if ( ( n % i == 0 ) && ( i == ( n / i ) ) ) {
      if ( ( i == ( n / i ) ) && ( n % i == 0 ) ) {
        result = result + i ;
      }
      else {
        result = result + ( i + n / i ) ;
      }
    }
  }
  return ( result + n + 1 ) ;
}

