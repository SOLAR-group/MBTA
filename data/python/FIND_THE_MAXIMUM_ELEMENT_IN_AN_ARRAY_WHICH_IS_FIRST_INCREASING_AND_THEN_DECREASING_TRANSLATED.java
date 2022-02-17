====================
public static int fGold ( int [ ] arr , int low , int high ) {
  int max = arr [ low ] ;
  int i ;
  for ( i = low ;
  i < high + 1 ;
  i ++ ) {
    if ( arr [ i ] > max ) {
      max = arr [ i ] ;
    }
  }
  return max ;
}

