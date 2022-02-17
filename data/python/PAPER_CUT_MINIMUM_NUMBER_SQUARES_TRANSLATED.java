====================
public static int f_gold ( int a , int b ) {
  int result = 0 ;
  int rem ;
  if ( ( a < b ) && ( b > 0 ) ) {
    a = b ;
    b = a ;
  }
  while ( ( b > 0 ) && ( b < a ) ) {
    result += ( int ) ( a / b ) ;
    rem = ( int ) ( a % b ) ;
    a = b ;
    b = rem ;
  }
  return result ;
}

