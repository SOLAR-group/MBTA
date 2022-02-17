====================
public static int f_gold ( int [ ] A , int [ ] B , int m , int n ) {
  int [ ] [ ] dp = new int [ m + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < m + 1 ;
  i ++ ) {
    dp [ i ] [ i ] = new int [ n + 1 ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      dp [ i ] [ j ] = Math . max ( ( dp [ i - 1 ] [ j - 1 ] + ( A [ j - 1 ] * B [ i - 1 ] ) ) , dp [ i ] [ j - 1 ] ) ;
    }
  }
  return dp [ n ] [ m ] ;
}

