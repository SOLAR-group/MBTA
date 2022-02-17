====================
public static final double fGoldenCoin ( double [ ] coin , int n , int k ) {
  Arrays . sort ( coin ) ;
  int coinsNeeded = Math . ceil ( 1.0 * n / ( k + 1 ) ) ;
  ;
  double ans = 0 ;
  for ( int i = 0 ;
  i < coinsNeeded - 1 + 1 ;
  i ++ ) {
    ans += coin [ i ] ;
  }
  return ans ;
}

