====================
public static int f_gold ( int [ ] X , int [ ] Y ) {
  int m = X . length ;
  int n = Y . length ;
  int [ ] [ ] L = new int [ n + 1 ] [ 2 ] ;
  boolean bi ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    bi = i & 1 ;
    for ( int j = 0 ;
    j < n + 1 ;
    j ++ ) {
      if ( ( i == 0 || j == 0 ) && ( X [ i ] == Y [ j - 1 ] ) ) {
        L [ bi ] [ j ] = 0 ;
      }
      else if ( ( X [ i ] == Y [ j - 1 ] ) && ( X [ i ] == Y [ j ] ) ) {
        L [ bi ] [ j ] = L [ 1 - bi ] [ j - 1 ] + 1 ;
      }
      else {
        L [ bi ] [ j ] = Math . max ( L [ 1 - bi ] [ j ] , L [ bi ] [ j - 1 ] ) ;
      }
    }
  }
  return L [ bi ] [ n ] ;
}

