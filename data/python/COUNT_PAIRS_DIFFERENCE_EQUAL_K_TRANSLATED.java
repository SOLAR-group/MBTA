====================
public static int fGold ( int [ ] arr , int n , int k ) {
  int count = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= n ;
    j ++ ) {
      if ( arr [ i ] - arr [ j ] == k || arr [ j ] - arr [ i ] == k ) {
        count ++ ;
      }
    }
  }
  return count ;
}

