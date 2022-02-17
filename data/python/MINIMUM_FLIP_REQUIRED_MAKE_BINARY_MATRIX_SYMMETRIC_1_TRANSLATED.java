====================
public static int f_gold ( int [ ] [ ] mat , int n ) {
  int flip = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( mat [ i ] [ j ] != mat [ j ] [ i ] ) {
        flip ++ ;
      }
    }
  }
  return flip ;
}

