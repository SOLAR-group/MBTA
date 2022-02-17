====================
public static int fGold ( int p , int q ) {
  int [ ] dp = new int [ q ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    dp [ i ] = 1 ;
  }
  for ( int i = 0 ;
  i < p - 1 ;
  i ++ ) {
    for ( int j = 1 ;
    j < q ;
    j ++ ) {
      dp [ j ] += dp [ j - 1 ] ;
    }
  }
  return dp [ q - 1 ] ;
}

