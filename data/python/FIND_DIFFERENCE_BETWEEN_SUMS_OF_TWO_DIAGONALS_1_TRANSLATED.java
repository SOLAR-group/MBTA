====================
public static int f_gold ( int [ ] [ ] arr , int n ) {
  double d1 = 0 ;
  double d2 = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    d1 = d1 + arr [ i ] [ i ] ;
    d2 = d2 + arr [ i ] [ n - i - 1 ] ;
  }
  return Math . abs ( d1 - d2 ) ;
}

