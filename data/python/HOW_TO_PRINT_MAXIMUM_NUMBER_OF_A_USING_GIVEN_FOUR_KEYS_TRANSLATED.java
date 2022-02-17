====================
public static int fGold ( int N ) {
  if ( ( N <= 6 ) && ( N > 0 ) ) return N ;
  int [ ] screen = new int [ N ] ;
  screen [ 0 ] = 0 ;
  for ( int n = 1 ;
  n < 7 ;
  n ++ ) screen [ n - 1 ] = n ;
  for ( int n = 7 ;
  n < N ;
  n ++ ) screen [ n - 1 ] = Math . max ( 2 * screen [ n - 4 ] , Math . max ( 3 * screen [ n - 5 ] , 4 * screen [ n - 6 ] ) ) ;
  ;
  return screen [ N - 1 ] ;
}

