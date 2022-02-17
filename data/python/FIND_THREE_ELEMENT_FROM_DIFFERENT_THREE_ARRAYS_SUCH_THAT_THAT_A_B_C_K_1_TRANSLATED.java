====================
public static boolean fGold ( int [ ] a1 , int [ ] a2 , int [ ] a3 , int n1 , int n2 , int n3 , int sum ) {
  Set < Integer > s = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n1 ;
  i ++ ) {
    s . add ( a1 [ i ] ) ;
  }
  for ( int i = 0 ;
  i < n2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n3 ;
    j ++ ) {
      if ( sum - a2 [ i ] - a3 [ j ] == s . size ( ) ) {
        return true ;
      }
    }
  }
  return false ;
}

