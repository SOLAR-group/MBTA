====================
static final double fGold ( double C , double l ) {
  if ( ( l >= C ) && ( l <= C ) ) return C ;
  double eqRoot = ( Math . sqrt ( 1 + 8 * ( C - l ) ) - 1 ) / 2 ;
  return Math . ceil ( eqRoot ) + l ;
}

