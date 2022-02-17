====================
static final double fGold ( double a , double b ) {
  if ( ( a == 0 || b == 0 ) && ( a == 0 || b == 0 ) ) return 1 ;
  return Math . floor ( Math . log10 ( Math . abs ( a ) ) + Math . log10 ( Math . abs ( b ) ) ) + 1 ;
}

