====================
public static int f_gold ( int [ ] arr , int n ) {
  int result = 0 ;
  ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= n ;
    j ++ ) {
      int product = arr [ i ] * arr [ j ] ;
      ;
      for ( int k = 0 ;
      k <= n ;
      k ++ ) {
        if ( ( arr [ k ] == product ) && ( arr [ k ] != 0 ) ) {
          result = result + 1 ;
          break ;
        }
      }
    }
  }
  return result ;
}

