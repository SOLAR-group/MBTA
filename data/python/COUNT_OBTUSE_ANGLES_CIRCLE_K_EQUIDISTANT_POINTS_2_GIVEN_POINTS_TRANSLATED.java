====================
public static int fGold ( int a , int b , int k ) {
  int c1 = ( b - a ) - 1 ;
  int c2 = ( k - b ) + ( a - 1 ) ;
  if ( ( c1 == c2 ) && ( c1 != 0 ) ) return 0 ;
  return Math . min ( c1 , c2 ) ;
}

