====================
public static int f_gold ( String str ) {
  int N = str . length ( ) ;
  int [ ] [ ] dp = new int [ N + 1 ] [ N + 1 ] ;
  for ( int y = 0 ;
  y < N ;
  y ++ ) {
    dp [ y ] = new int [ N + 1 ] ;
    for ( int l = 1 ;
    l <= N ;
    l ++ ) {
      int i = 0 ;
      int j = l - 1 ;
      while ( j < N ) {
        if ( ( l == 1 ) && ( str . charAt ( i ) == str . charAt ( i + 1 ) ) ) {
          dp [ i ] [ j ] = 1 ;
        }
        else {
          dp [ i ] [ j ] = 1 + dp [ i + 1 ] [ j ] ;
          if ( ( str . charAt ( i ) == str . charAt ( i + 2 ) ) && ( str . charAt ( i + 1 ) == str . charAt ( i + 3 ) ) ) {
            dp [ i ] [ j ] = Math . min ( 1 + dp [ i + 2 ] [ j ] , dp [ i ] [ j ] ) ;
          }
          for ( int K = i + 2 ;
          K <= j ;
          K ++ ) {
            if ( ( str . charAt ( i ) == str . charAt ( K ) ) && ( str . charAt ( K + 1 ) == str . charAt ( K + 2 ) ) ) {
              dp [ i ] [ j ] = Math . min ( dp [ i + 1 ] [ K - 1 ] + dp [ K + 1 ] [ j ] , dp [ i ] [ j ] ) ;
            }
          }
        }
        i ++ ;
        j ++ ;
      }
    }
  }
  return dp [ 0 ] [ N - 1 ] ;
}

