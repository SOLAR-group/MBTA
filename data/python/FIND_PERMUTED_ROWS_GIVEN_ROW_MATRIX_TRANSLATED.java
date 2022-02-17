====================
public static void f_gold ( int [ ] [ ] mat , int m , int n , int r ) {
  HashSet < Integer > s = new HashSet < Integer > ( ) ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) s . add ( mat [ r ] [ j ] ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( i == r ) continue ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( mat [ i ] [ j ] != s . contains ( mat [ r ] [ j ] ) ) {
        j = j - 2 ;
        break ;
      }
    }
    if ( j + 1 != n ) continue ;
    System . out . println ( i ) ;
  }
}

