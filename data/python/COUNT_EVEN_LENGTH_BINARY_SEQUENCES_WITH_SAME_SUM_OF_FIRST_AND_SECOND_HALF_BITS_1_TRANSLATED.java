====================
public static double f_gold ( int n ) {
  double nCr = 1 ;
  double res = 1 ;
  for ( int r = 1 ;
  r <= n ;
  r ++ ) {
    nCr = ( nCr * ( n + 1 - r ) ) / r ;
    ;
    res += nCr * nCr ;
  };
  return res ;
}

