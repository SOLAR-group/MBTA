====================
public static int fGold ( int [ ] price , int n , int k ) {
  int [ ] [ ] profit = new int [ n + 1 ] [ k + 1 ] ;
  for ( int i = 1 ;
  i <= k ;
  i ++ ) {
    profit [ i ] = new int [ n + 1 ] ;
  }
  for ( int i = 1 ;
  i <= k ;
  i ++ ) {
    double prevDiff = Double . NEGATIVE_INFINITY ;
    for ( int j = 1 ;
    j <= n ;
    j ++ ) {
      prevDiff = Math . max ( prevDiff , profit [ i - 1 ] [ j - 1 ] - price [ j - 1 ] ) ;
      profit [ i ] [ j ] = Math . max ( profit [ i ] [ j - 1 ] , price [ j ] + prevDiff ) ;
    }
  }
  return profit [ k ] [ n - 1 ] ;
}

