====================
public static int f_gold ( int low , int high ) {
  int fact = 1 ;
  int x = 1 ;
  while ( ( fact < low ) && ( x < high ) ) {
    fact = fact * x ;
    x ++ ;
  }
  int res = 0 ;
  while ( ( fact <= high ) && ( x < high ) ) {
    res ++ ;
    fact = fact * x ;
    x ++ ;
  }
  return res ;
}

