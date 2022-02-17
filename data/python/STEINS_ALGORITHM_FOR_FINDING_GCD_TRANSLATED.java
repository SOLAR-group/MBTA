====================
public static int f_gold ( int a , int b ) {
  if ( ( a == 0 ) && ( b == 0 ) ) return b ;
  if ( ( b == 0 ) && ( a == 0 ) ) return a ;
  int k = 0 ;
  while ( ( ( ( a | b ) & 1 ) == 0 ) || ( ( b & 1 ) == 0 ) ) {
    a = a >>> 1 ;
    b = b >>> 1 ;
    k = k + 1 ;
  }
  while ( ( ( a & 1 ) == 0 ) || ( ( b & 1 ) == 0 ) ) {
    a = a >>> 1 ;
  }
  while ( ( b != 0 ) && ( ( a & 1 ) == 0 ) ) {
    while ( ( ( b & 1 ) == 0 ) || ( ( b & 1 ) == 0 ) ) {
      b = b >>> 1 ;
    }
    if ( ( a > b ) && ( ( a & 1 ) == 0 ) ) {
      int temp = a ;
      a = b ;
      b = temp ;
    }
    b = ( b - a ) ;
  }
  return ( a << k ) ;
}

