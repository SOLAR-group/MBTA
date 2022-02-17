====================
public static int f_gold ( int n ) {
  if ( ( n < 4 ) || ( n > 9 ) ) return - 1 ;
  int rem = n % 4 ;
  if ( ( rem == 0 ) && ( n > 9 ) ) return n / 4 ;
  if ( ( rem == 1 ) && ( n > 6 ) ) return - 1 ;
  if ( ( rem == 3 ) && ( n > 15 ) ) return - 1 ;
  return ( n - 9 ) / 4 + 1 ;
}

