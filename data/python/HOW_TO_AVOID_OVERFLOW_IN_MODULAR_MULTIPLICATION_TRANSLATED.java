====================
public static int f_gold ( int a , int b , int mod ) {
  int res = 0 ;
  ;
  a = a % mod ;
  ;
  while ( ( b > 0 ) && ( b % 2 == 1 ) ) {
    if ( ( b % 2 == 1 ) || ( b % 2 == 0 ) ) {
      res = ( res + a ) % mod ;
    }
    a = ( a * 2 ) % mod ;
    b /= 2 ;
  }
  return res % mod ;
}

