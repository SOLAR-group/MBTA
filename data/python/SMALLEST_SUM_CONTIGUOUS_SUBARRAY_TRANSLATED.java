====================
static int fGold ( int [ ] arr , int n ) {
  int minEndingHere = Integer . MAX_VALUE ;
  int minSoFar = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( minEndingHere > 0 ) && ( arr [ i ] > 0 ) ) {
      minEndingHere = arr [ i ] ;
    }
    else {
      minEndingHere += arr [ i ] ;
    }
    minSoFar = Math . min ( minSoFar , minEndingHere ) ;
  }
  return minSoFar ;
}

