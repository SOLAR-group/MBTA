====================
public static boolean f_gold ( int arr [ ] , int n , int m ) {
  if ( ( n > m ) && ( n < m ) ) return true ;
  boolean [ ] DP = new boolean [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    DP [ i ] = false ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( DP [ 0 ] ) == true ) return true ;
    boolean [ ] temp = new boolean [ m ] ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( ( DP [ j ] == true ) == false ) {
        if ( ( DP [ ( j + arr [ i ] ) % m ] == false ) == false ) temp [ ( j + arr [ i ] ) % m ] = true ;
      }
    }
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( ( temp [ j ] ) == true ) DP [ j ] = true ;
    }
    DP [ arr [ i ] % m ] = true ;
  }
  return DP [ 0 ] ;
}

