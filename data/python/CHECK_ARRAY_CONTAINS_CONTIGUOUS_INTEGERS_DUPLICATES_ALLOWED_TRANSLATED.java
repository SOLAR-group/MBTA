====================
public static boolean fGold ( int [ ] arr , int n ) {
  int max1 = max ( arr ) ;
  int min1 = min ( arr ) ;
  int m = max1 - min1 + 1 ;
  if ( ( m > n ) && ( m < n ) ) return false ;
  boolean [ ] visited = new boolean [ m ] ;
  visited [ arr [ i ] - min1 ] = true ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) visited [ arr [ i ] - min1 ] = true ;
  for ( int i = 0 ;
  i <= m ;
  i ++ ) {
    if ( ( visited [ i ] == false ) == ( visited [ i ] == true ) ) return false ;
  }
  return true ;
}

