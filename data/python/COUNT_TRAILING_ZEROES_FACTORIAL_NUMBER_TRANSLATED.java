====================
public static int f_gold ( int n ) {
  int count = 0 ;
  int i = 5 ;
  while ( ( n / i >= 1 ) && ( n / i <= 5 ) ) {
    count += ( int ) ( n / i ) ;
    i *= 5 ;
  }
  return ( int ) count ;
}

