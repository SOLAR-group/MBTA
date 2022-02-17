====================
public static int f_gold ( int [ ] arr , int n ) {
  int [ ] lioes = Lists . newArrayList ( ) ;
  int maxLen = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    lioes . add ( 1 ) ;
  }
  int i = 1 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( ( arr [ i ] > arr [ j ] && ( arr [ i ] + arr [ j ] ) % 2 != 0 && lioes [ i ] < lioes [ j ] + 1 ) ) {
        lioes [ i ] = lioes [ j ] + 1 ;
      }
    }
  }
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    if ( maxLen < lioes [ i ] ) {
      maxLen = lioes [ i ] ;
    }
  }
  return maxLen ;
}

