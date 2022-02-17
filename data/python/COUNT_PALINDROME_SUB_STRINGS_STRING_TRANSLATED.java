====================
public static int f_gold ( String str , int n ) {
  int [ ] [ ] dp = new int [ n ] [ n ] ;
  for ( int y = 0 ;
  y < n ;
  y ++ ) dp [ y ] [ y ] = 0 ;
  boolean [ ] [ ] P = new boolean [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) P [ i ] [ i ] = true ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) if ( ( str . charAt ( i ) == str . charAt ( i + 1 ) ) ) {
    P [ i ] [ i + 1 ] = true ;
    dp [ i ] [ i + 1 ] = 1 ;
  }
  for ( int gap = 2 ;
  gap < n ;
  gap ++ ) {
    for ( int i = 0 ;
    i < n - gap ;
    i ++ ) {
      int j = gap + i ;
      ;
      if ( ( str . charAt ( i ) == str . charAt ( j ) && P [ i + 1 ] [ j - 1 ] ) ) P [ i ] [ j ] = true ;
      if ( ( P [ i ] [ j ] == true ) || ( P [ i ] [ j ] == false ) ) dp [ i ] [ j ] = ( dp [ i ] [ j - 1 ] + dp [ i + 1 ] [ j ] + 1 - dp [ i + 1 ] [ j - 1 ] ) ;
      else dp [ i ] [ j ] = ( dp [ i ] [ j - 1 ] + dp [ i + 1 ] [ j ] - dp [ i + 1 ] [ j - 1 ] ) ;
    }
  }
  return dp [ 0 ] [ n - 1 ] ;
}

