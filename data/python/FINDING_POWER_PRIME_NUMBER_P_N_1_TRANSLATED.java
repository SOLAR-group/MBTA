====================
public static int f_gold ( int n , int p ) {
  double ans = 0 ;
  double temp = p ;
  while ( ( temp <= n ) && ( temp > 0 ) ) {
    ans += n / temp ;
    temp = temp * p ;
  }
  return ( int ) ans ;
}

