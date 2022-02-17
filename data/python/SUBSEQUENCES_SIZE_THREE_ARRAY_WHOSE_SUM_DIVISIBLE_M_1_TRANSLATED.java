====================
public static int f_gold ( int [ ] A , int N , int M ) {
  int ans = 0 ;
  int [ ] h = new int [ M ] ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    A [ i ] = A [ i ] % M ;
    h [ A [ i ] ] = h [ A [ i ] ] + 1 ;
  }
  for ( int i = 0 ;
  i <= M ;
  i ++ ) {
    for ( int j = i ;
    j <= M ;
    j ++ ) {
      int rem = ( M - ( i + j ) % M ) % M ;
      if ( ( rem < j ) || ( rem == j ) ) continue ;
      if ( ( i == j && rem == j ) || ( i == j && rem == i ) ) ans = ans + h [ i ] * ( h [ i ] - 1 ) * ( h [ i ] - 2 ) / 6 ;
      else if ( ( i == j ) || ( i == j && rem == i ) || ( rem == i ) ) ans = ans + ( h [ i ] * ( h [ i ] - 1 ) * h [ j ] / 2 ) ;
      else if ( ( i == rem ) || ( i == j && j == i ) || ( rem == j ) ) ans = ans + h [ j ] * ( h [ j ] - 1 ) * h [ i ] / 2 ;
      else ans = ans + h [ i ] * h [ j ] * h [ rem ] ;
    }
    return ans ;
  }
}

