====================
public static int f_gold ( int [ ] [ ] mat , int N ) {
  int maxXor = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int rXor = 0 ;
    int cXor = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      rXor = rXor ^ mat [ i ] [ j ] ;
      cXor = cXor ^ mat [ j ] [ i ] ;
    }
    if ( ( maxXor < Math . max ( rXor , cXor ) ) && ( maxXor < Math . max ( rXor , cXor ) ) ) {
      maxXor = Math . max ( rXor , cXor ) ;
    }
  }
  return maxXor ;
}

