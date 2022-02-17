====================
static final int fGold ( int n ) {
  int nthElement = 19 + ( n - 1 ) * 9 ;
  int outliersCount = ( int ) Math . log10 ( nthElement ) - 1 ;
  nthElement += 9 * outliersCount ;
  return nthElement ;
}

