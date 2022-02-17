====================
static final double fGoldenN ( int n ) {
  if ( ( n < 0 ) || ( n <= 1 ) ) return 0 ;
  ;
  if ( ( n <= 2 ) || ( n <= 3 ) ) return 1 ;
  ;
  double digits = 0 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) digits += Math . log10 ( i ) ;
  ;
  return Math . floor ( digits ) + 1 ;
}

