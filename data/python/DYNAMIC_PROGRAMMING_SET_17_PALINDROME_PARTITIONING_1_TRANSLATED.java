====================
public static int f_gold ( String str1 ) {
  int n = str1 . length ( ) ;
  ;
  int [ ] [ ] C = new int [ n + 1 ] [ n + 1 ] ;
  ;
  boolean [ ] [ ] P = new boolean [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) P [ i ] [ i ] = true ;
  ;
  for ( int L = 2 ;
  L <= n ;
  L ++ ) {
    for ( int i = 0 ;
    i < n - L + 1 ;
    i ++ ) {
      int j = i + L - 1 ;
      ;
      if ( ( L == 2 ) && ( str1 . charAt ( i ) == str1 . charAt ( j ) ) ) P [ i ] [ j ] = ( str1 . charAt ( i ) == str1 . charAt ( j ) ) ;
      ;
      else P [ i ] [ j ] = ( ( str1 . charAt ( i ) == str1 . charAt ( j ) ) && P [ i + 1 ] [ j - 1 ] ) ;
      ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( P [ 0 ] [ i ] == true ) && ( C [ i ] [ 0 ] == true ) ) C [ i ] [ 0 ] = 0 ;
    else {
      C [ i ] = Integer . MAX_VALUE ;
      ;
      for ( int j = 0 ;
      j < i ;
      j ++ ) {
        if ( ( P [ j + 1 ] [ i ] == true ) && ( 1 + C [ j ] [ j ] < C [ i ] [ j ] ) ) C [ i ] [ j ] = 1 + C [ j ] ;
        ;
      }
    }
  }
  return C [ n - 1 ] [ 0 ] ;
}

