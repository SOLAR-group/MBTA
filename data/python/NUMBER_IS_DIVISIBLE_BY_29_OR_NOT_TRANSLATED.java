====================
public static boolean fGold ( int n ) {
  while ( ( int ) ( n / 100 ) != 0 ) {
    int lastDigit = ( int ) ( n % 10 ) ;
    n = ( int ) ( n / 10 ) ;
    n += lastDigit * 3 ;
  }
  return ( n % 29 == 0 ) ;
}

