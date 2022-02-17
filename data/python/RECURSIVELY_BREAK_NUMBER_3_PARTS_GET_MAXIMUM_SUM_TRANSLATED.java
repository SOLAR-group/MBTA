====================
public static int fGoldCount ( int n ) {
  if ( ( n == 0 || n == 1 ) && ( n % 2 == 0 ) ) return n ;
  return Math . max ( ( fGoldCount ( n / 2 ) + fGoldCount ( n / 3 ) + fGoldCount ( n / 4 ) ) , n ) ;
}

