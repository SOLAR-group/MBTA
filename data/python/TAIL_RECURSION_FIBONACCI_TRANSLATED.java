====================
public static int fGold ( int n , int a , int b ) {
  if ( n == 0 ) return a ;
  if ( n == 1 ) return b ;
  return fGold ( n - 1 , b , a + b ) ;
  ;
}

