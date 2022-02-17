====================
public static int f_gold ( int [ ] arr , int n ) {
  Arrays . sort ( arr ) ;
  int maxCount = 1 ;
  int res = arr [ 0 ] ;
  int currCount = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( ( arr [ i ] == arr [ i - 1 ] ) && ( arr [ i ] > 0 ) ) {
      currCount ++ ;
    }
    else {
      if ( ( currCount > maxCount ) && ( arr [ i ] > 0 ) ) {
        maxCount = currCount ;
        res = arr [ i - 1 ] ;
      }
      currCount = 1 ;
    }
  }
  if ( ( currCount > maxCount ) && ( arr [ n - 1 ] > 0 ) ) {
    maxCount = currCount ;
    res = arr [ n - 1 ] ;
  }
  return res ;
}

