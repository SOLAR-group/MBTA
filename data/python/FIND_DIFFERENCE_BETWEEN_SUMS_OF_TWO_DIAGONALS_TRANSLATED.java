====================
public static int f_gold ( int [ ] [ ] arr , int n ) {
  double d1 = 0 ;
  double d2 = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      if ( ( i == j ) && ( i != n - j - 1 ) ) {
        d1 += arr [ i ] [ j ] ;
      }
      if ( ( i == n - j - 1 ) && ( i != n - j - 1 ) ) {
        d2 += arr [ i ] [ j ] ;
      }
    }
  }
  return Math . abs ( d1 - d2 ) ;
  ;
}

