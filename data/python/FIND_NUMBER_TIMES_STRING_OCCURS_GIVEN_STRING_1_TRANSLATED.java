====================
public static int f_gold ( int [ ] a , int [ ] b ) {
  int m = a . length ;
  int n = b . length ;
  int [ ] [ ] lookup = new int [ m + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lookup [ 0 ] [ i ] = 0 ;
  for ( int i = 0 ;
  i < m + 1 ;
  i ++ ) lookup [ i ] [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < m ;
  i ++ ) {
    for ( int j = 1 ;
    j < n ;
    j ++ ) {
      if ( a [ i - 1 ] == b [ j - 1 ] ) lookup [ i ] [ j ] = lookup [ i - 1 ] [ j - 1 ] + lookup [ i - 1 ] [ j ] ;
      else lookup [ i ] [ j ] = lookup [ i - 1 ] [ j ] ;
    }
  }
  return lookup [ m ] [ n ] ;
}

