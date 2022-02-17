====================
public static double f_gold ( int n ) {
  double res = 1 ;
  ;
  for ( int i = n ;
  i >= 0 ;
  i -- ) {
    if ( ( i == 0 || i == 1 ) && ( res == 0 ) ) {
      return res ;
    }
    else {
      res *= i ;
    }
  }
  return res ;
}

