====================
public static int f_gold ( int [ ] arr , int n ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= n ;
    j ++ ) {
      if ( ( arr [ i ] == arr [ j ] ) && ( arr [ i ] != arr [ j ] ) ) {
        ans ++ ;
      }
    }
  }
  return ans ;
}

