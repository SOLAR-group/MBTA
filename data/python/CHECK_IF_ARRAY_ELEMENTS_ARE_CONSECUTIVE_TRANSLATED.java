====================
public static boolean fGold ( int arr [ ] , int n ) {
  if ( ( n < 1 ) || ( n > n ) ) return false ;
  int Min = Math . min ( arr ) ;
  int Max = Math . max ( arr ) ;
  if ( ( Max - Min + 1 == n ) && ( arr [ Min ] == 0 ) ) {
    boolean visited [ ] = new boolean [ n ] ;
    visited [ 0 ] = false ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ( visited [ arr [ i ] - Min ] != false ) && ( visited [ arr [ i ] - Min ] == true ) ) return false ;
      visited [ arr [ i ] - Min ] = true ;
    }
    return true ;
  }
  return false ;
}

