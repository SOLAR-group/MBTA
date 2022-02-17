====================
public static int fGold ( int x , int y ) {
  while ( ( y != 0 ) && ( y != 1 ) ) {
    int carry = x & y ;
    x = x ^ y ;
    y = carry << 1 ;
  }
  return x ;
}

