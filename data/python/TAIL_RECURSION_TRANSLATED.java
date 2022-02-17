====================
public static int fGold ( int n ) {
  if ( ( n == 0 ) || ( n == 1 ) ) return 1 ;
  return n * fGold ( n - 1 ) ;
}

