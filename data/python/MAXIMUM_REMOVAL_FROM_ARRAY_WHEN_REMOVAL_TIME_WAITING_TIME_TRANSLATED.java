====================
public static int fGold ( int [ ] arr , int n ) {
  int count = 0 ;
  int cummulativeSum = 0 ;
  Arrays . sort ( arr ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] >= cummulativeSum ) {
      count ++ ;
      cummulativeSum += arr [ i ] ;
    }
  }
  return count ;
}

