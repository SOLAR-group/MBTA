====================
public static int fGold ( int [ ] a , int [ ] b , int k , int n1 , int n2 ) {
  Set < Integer > s = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n2 ;
  i ++ ) s . add ( b [ i ] ) ;
  int missing = 0 ;
  for ( int i = 0 ;
  i < n1 ;
  i ++ ) {
    if ( a [ i ] != s . contains ( b [ i ] ) ) missing ++ ;
    if ( missing == k ) return a [ i ] ;
  }
  return - 1 ;
}

