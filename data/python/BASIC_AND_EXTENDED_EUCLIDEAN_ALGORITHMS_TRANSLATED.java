====================
public static int fGold ( int a , int b ) {
  if ( a == 0 ) return b ;
  return fGold ( b % a , a ) ;
}

