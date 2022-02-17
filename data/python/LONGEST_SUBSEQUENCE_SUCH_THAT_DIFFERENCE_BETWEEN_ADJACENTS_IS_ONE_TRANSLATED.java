====================
public static int f_gold ( int [ ] arr , int n ) {
  int [ ] dp = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( ( ( arr [ i ] == arr [ j ] + 1 ) || ( arr [ i ] == arr [ j ] - 1 ) ) && ( ( arr [ j ] == arr [ i ] ) || ( arr [ j ] == arr [ i ] - 1 ) ) ) {
        dp [ i ] = Math . max ( dp [ i ] , dp [ j ] + 1 ) ;
      }
    }
  }
  int result = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( result < dp [ i ] ) && ( ( arr [ i ] == arr [ j ] ) || ( arr [ i ] == arr [ j ] - 1 ) ) ) {
      result = dp [ i ] ;
    }
  }
  return result ;
}

