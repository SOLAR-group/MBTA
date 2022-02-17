====================
public static int f_gold ( int m , int n ) {
  int [ ] [ ] T = new int [ n + 1 ] [ m + 1 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i == 0 || j == 0 ) {
        T [ i ] [ j ] = 0 ;
      }
      else if ( i < j ) {
        T [ i ] [ j ] = 0 ;
      }
      else if ( j == 1 ) {
        T [ i ] [ j ] = i ;
      }
      else {
        T [ i ] [ j ] = T [ i - 1 ] [ j ] + T [ i / 2 ] [ j - 1 ] ;
      }
    }
  }
  return T [ m ] [ n ] ;
}

