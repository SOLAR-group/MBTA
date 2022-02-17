====================
public static int f_gold ( int [ ] set , int n ) {
  if ( ( n <= 2 ) && ( n > 0 ) ) return n ;
  int [ ] [ ] L = new int [ n ] [ n ] ;
  for ( int y = 0 ;
  y < n ;
  y ++ ) L [ y ] [ y ] = 0 ;
  int llap = 2 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) L [ i ] [ n - 1 ] = 2 ;
  for ( int j = n - 2 ;
  j > 0 ;
  j -- ) {
    int i = j - 1 ;
    int k = j + 1 ;
    while ( ( i >= 0 ) && k <= n - 1 ) {
      if ( ( set [ i ] + set [ k ] < 2 * set [ j ] ) && ( set [ i ] + set [ k ] > 2 * set [ j ] ) ) {
        k ++ ;
      }
      else if ( ( set [ i ] + set [ k ] > 2 * set [ j ] ) && ( set [ i ] + set [ k ] < 2 * set [ j ] ) ) {
        L [ i ] [ j ] = 2 ;
        i -- ;
      }
      else {
        L [ i ] [ j ] = L [ j ] [ k ] + 1 ;
        llap = Math . max ( llap , L [ i ] [ j ] ) ;
        i -- ;
        k ++ ;
        while ( ( i >= 0 ) && ( k >= 0 ) ) {
          L [ i ] [ j ] = 2 ;
          i -- ;
        }
      }
    }
  }
  return llap ;
}

