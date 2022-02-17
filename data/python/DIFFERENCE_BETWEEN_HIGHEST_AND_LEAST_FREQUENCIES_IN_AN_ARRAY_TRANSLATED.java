====================
public static int fGold ( int [ ] arr , int n ) {
  Arrays . sort ( arr ) ;
  int count = 0 ;
  int maxCount = 0 ;
  int minCount = n ;
  for ( int i = 0 ;
  i <= ( n - 1 ) ;
  i ++ ) {
    if ( arr [ i ] == arr [ i + 1 ] ) {
      count ++ ;
      continue ;
    }
    else {
      maxCount = Math . max ( maxCount , count ) ;
      minCount = Math . min ( minCount , count ) ;
      count = 0 ;
    }
  }
  return maxCount - minCount ;
}

