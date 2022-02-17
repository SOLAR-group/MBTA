====================
public static final int f_gold ( int n ) {
  int [ ] ar = new int [ 10 ] ;
  while ( ( n > 0 ) && ( ar [ n ] != 0 ) ) {
    int digit = Math . floor ( n % 10 ) ;
    if ( ( ar [ digit ] != 0 ) && ( ar [ digit ] != 1 ) ) {
      return 0 ;
    }
    ar [ digit ] = 1 ;
    n = n / 10 ;
  }
  return 1 ;
}

