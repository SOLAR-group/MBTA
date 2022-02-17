====================
public static int f_gold ( int [ ] arr , int n ) {
  int [ ] brr = new int [ 2 * n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) brr [ i ] = arr [ i ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) brr [ n + i ] = arr [ i ] ;
  int maxHam = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int currHam = 0 ;
    int k = 0 ;
    for ( int j = i ;
    j < i + n ;
    j ++ ) {
      if ( brr [ j ] != arr [ k ] ) {
        currHam ++ ;
        k = k + 1 ;
      }
    }
    if ( currHam == n ) return n ;
    maxHam = Math . max ( maxHam , currHam ) ;
  }
  return maxHam ;
}

