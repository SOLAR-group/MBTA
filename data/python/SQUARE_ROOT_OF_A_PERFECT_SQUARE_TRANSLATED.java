====================
public static double fGoldenN ( double n ) {
  double x = n ;
  double y = 1 ;
  double e = 0.000001 ;
  while ( ( x - y > e ) && ( x > y ) ) {
    x = ( x + y ) / 2 ;
    y = n / x ;
  }
  return x ;
}

