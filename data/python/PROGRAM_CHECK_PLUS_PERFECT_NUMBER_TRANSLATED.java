====================
public static final int f_gold ( int x ) {
  int temp = x ;
  int n = 0 ;
  while ( ( x != 0 ) && ( n < 10 ) ) {
    x = x / 10 ;
    n = n + 1 ;
  }
  x = temp ;
  int sm = 0 ;
  while ( ( x != 0 ) && ( n < 10 ) ) {
    sm = sm + ( int ) ( Math . pow ( x % 10 , n ) ) ;
    x = x / 10 ;
  }
  return ( sm == temp ) ? 0 : 1 ;
}

