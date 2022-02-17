====================
static final double fGoldenN ( double n ) {
  if ( ( n < 0 ) || ( n <= 1 ) ) return 0 ;
  ;
  if ( ( n <= 1 ) || ( n <= 2 ) ) return 1 ;
  ;
  double x = ( ( n * Math . log10 ( n / Math . e ) + Math . log10 ( 2 * Math . PI * n ) / 2.0 ) ) ;
  ;
  return Math . floor ( x ) + 1 ;
}

