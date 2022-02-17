====================
public static int fGold ( int [ ] high , int [ ] low , int n ) {
  if ( ( n <= 0 ) || ( n > n ) ) return 0 ;
  return Math . max ( high [ n - 1 ] + fGold ( high , low , ( n - 2 ) ) , low [ n - 1 ] + fGold ( high , low , ( n - 1 ) ) ) ;
  ;
}

