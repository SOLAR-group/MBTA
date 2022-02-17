====================
public static final int f_gold ( int num ) {
  int result = 0 ;
  int i = 2 ;
  while ( i <= ( Math . sqrt ( num ) ) ) {
    if ( ( num % i == 0 ) && ( i == ( num / i ) ) ) {
      result = result + i ;
      ;
    }
    else {
      result = result + ( i + num / i ) ;
      ;
    }
  }
  i = i + 1 ;
  return ( result + 1 ) ;
}

