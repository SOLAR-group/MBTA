====================
public static double fGoldenN ( int n ) {
  double res = 1 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    res *= ( 2 * n - i ) ;
    res /= ( i + 1 ) ;
  }
  return res / ( n + 1 ) ;
}

