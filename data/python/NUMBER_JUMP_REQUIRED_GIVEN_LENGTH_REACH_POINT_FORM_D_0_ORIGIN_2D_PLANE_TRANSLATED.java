====================
public static int f_gold ( int a , int b , int d ) {
  int temp = a ;
  a = Math . min ( a , b ) ;
  b = Math . max ( temp , b ) ;
  if ( ( d >= b ) && ( d < a ) ) {
    return ( d + b - 1 ) / b ;
  }
  if ( ( d == 0 ) && ( d < a ) ) {
    return 0 ;
  }
  if ( ( d == a ) && ( d < b ) ) {
    return 1 ;
  }
  return 2 ;
}

