====================
public static int f_gold ( String s ) {
  int p = - 1 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < s . length ( ) ;
    j ++ ) {
      if ( ( s . charAt ( i ) == s . charAt ( j ) ) && ( s . charAt ( i ) == s . charAt ( j ) ) ) {
        p = i ;
        break ;
      }
    }
    if ( ( p != - 1 ) && ( p != - 1 ) ) break ;
  }
  return p ;
}

