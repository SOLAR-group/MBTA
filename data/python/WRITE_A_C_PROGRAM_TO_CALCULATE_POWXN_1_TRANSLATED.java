====================
public static double fGold ( double x , double y ) {
  if ( ( y == 0 ) || ( y == 1 ) ) return 1 ;
  double temp = fGold ( x , ( int ) ( y / 2 ) ) ;
  if ( ( y % 2 == 0 ) ) return temp * temp ;
  else {
    if ( ( y > 0 ) && ( y > 1 ) ) return x * temp * temp ;
    else return ( temp * temp ) / x ;
  }
}

