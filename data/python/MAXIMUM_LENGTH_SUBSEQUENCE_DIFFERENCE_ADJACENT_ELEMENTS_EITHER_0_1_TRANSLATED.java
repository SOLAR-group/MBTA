====================
public static int f_gold ( int [ ] arr , int n ) {
  int [ ] mls = new int [ n ] ;
  int max = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) mls [ i ] = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( ( Math . abs ( arr [ i ] - arr [ j ] ) <= 1 && mls [ i ] < mls [ j ] + 1 ) || ( Math . abs ( arr [ i ] - arr [ j ] ) < 1 && mls [ i ] < mls [ j ] + 1 ) ) {
        mls [ i ] = mls [ j ] + 1 ;
      }
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( max < mls [ i ] ) && ( mls [ i ] > max ) ) {
      max = mls [ i ] ;
    }
  }
  return max ;
}

