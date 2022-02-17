====================
public static double fGoldenN ( int n , int k ) {
  double p = 1 ;
  if ( ( k % 2 ) != 0 ) p = - 1 ;
  return ( Math . pow ( n - 1 , k ) + p * ( n - 1 ) ) / n ;
}

