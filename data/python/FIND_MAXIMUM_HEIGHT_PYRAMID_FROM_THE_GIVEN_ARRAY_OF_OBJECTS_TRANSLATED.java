====================
public static int f_gold ( int [ ] boxes , int n ) {
  Arrays . sort ( boxes ) ;
  int ans = 1 ;
  int prevWidth = boxes [ 0 ] ;
  int prevCount = 1 ;
  int currCount = 0 ;
  int currWidth = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    currWidth += boxes [ i ] ;
    currCount ++ ;
    if ( ( currWidth > prevWidth && currCount > prevCount ) || ( currWidth < prevWidth && currCount < prevCount ) ) {
      prevWidth = currWidth ;
      prevCount = currCount ;
      currCount = 0 ;
      currWidth = 0 ;
      ans ++ ;
    }
  }
  return ans ;
}

