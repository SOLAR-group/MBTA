====================
public static int f_gold ( String S , String T ) {
  int m = T . length ( ) ;
  int n = S . length ( ) ;
  if ( m > n ) return 0 ;
  int [ ] [ ] mat = new int [ n + 1 ] [ m + 1 ] ;
  for ( int __ = 0 ;
  __ < m ;
  __ ++ ) mat [ __ ] [ 0 ] = 0 ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) mat [ i ] [ 0 ] = 0 ;
  for ( int j = 0 ;
  j <= n ;
  j ++ ) mat [ 0 ] [ j ] = 1 ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    for ( int j = 1 ;
    j <= n ;
    j ++ ) {
      if ( T . charAt ( i - 1 ) != S . charAt ( j - 1 ) ) mat [ i ] [ j ] = mat [ i ] [ j - 1 ] ;
      else mat [ i ] [ j ] = ( mat [ i ] [ j - 1 ] + mat [ i - 1 ] [ j - 1 ] ) ;
    }
  }
  return mat [ m ] [ n ] ;
}

