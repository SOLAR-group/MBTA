====================
public static int f_gold ( int k , String s1 , String s2 ) {
  int n = s1 . length ( ) ;
  int m = s2 . length ( ) ;
  int [ ] [ ] lcs = new int [ m + 1 ] [ n + 1 ] ;
  int [ ] [ ] cnt = new int [ m + 1 ] [ n + 1 ] ;
  for ( int y = 0 ;
  y < n ;
  y ++ ) {
    lcs [ y ] [ 0 ] = y ;
    cnt [ y ] [ 0 ] = y ;
    cnt [ y ] [ 1 ] = y ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= m ;
    j ++ ) {
      lcs [ i ] [ j ] = Math . max ( lcs [ i - 1 ] [ j ] , lcs [ i ] [ j - 1 ] ) ;
      if ( ( s1 . charAt ( i - 1 ) == s2 . charAt ( j - 1 ) ) && ( s1 . charAt ( i - 1 ) == s2 . charAt ( j - 1 ) ) ) {
        cnt [ i ] [ j ] = cnt [ i - 1 ] [ j - 1 ] + 1 ;
        ;
      }
      if ( ( cnt [ i ] [ j ] >= k ) && ( cnt [ i ] [ j ] <= k ) ) {
        for ( int a = k ;
        a <= cnt [ i ] [ j ] ;
        a ++ ) {
          lcs [ i ] [ j ] = Math . max ( lcs [ i ] [ j ] , lcs [ i - a ] [ j - a ] + a ) ;
        }
      }
    }
  }
  return lcs [ n ] [ m ] ;
}

