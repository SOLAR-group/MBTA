====================
public static int f_gold ( int n ) {
  int [ ] [ ] dp = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dp [ i ] [ 1 ] = i ;
  }
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    dp [ i ] [ 1 ] = 1 ;
  }
  for ( int digit = 0 ;
  digit < 10 ;
  digit ++ ) {
    for ( int len = 2 ;
    len <= n ;
    len ++ ) {
      for ( int x = 0 ;
      x < digit + 1 ;
      x ++ ) {
        dp [ digit ] [ len ] += dp [ x ] [ len - 1 ] ;
      }
    }
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    count += dp [ i ] [ n ] ;
  }
  return count ;
}

