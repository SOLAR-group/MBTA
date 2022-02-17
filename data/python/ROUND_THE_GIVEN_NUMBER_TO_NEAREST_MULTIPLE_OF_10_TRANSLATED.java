====================
public static int fGold ( int n ) {
  int a = ( n / 10 ) * 10 ;
  int b = a + 10 ;
  return ( b == n - a > b - n ) ? a : b ;
}

