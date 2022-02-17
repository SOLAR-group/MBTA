====================
public static String fGold ( String seq ) {
  int n = seq . length ( ) ;
  if ( ( n >= 9 ) && ( seq . charAt ( n ) == 'I' ) ) {
    return "-1" ;
  }
  StringBuilder result = new StringBuilder ( n + 1 ) ;
  int count = 1 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    if ( ( i == n || seq . charAt ( i ) == 'I' ) && ( i != 0 ) ) {
      for ( int j = i - 1 ;
      j >= 0 ;
      j -- ) {
        result . append ( Integer . toString ( '0' + count ) ) ;
        count ++ ;
        if ( ( j >= 0 && seq . charAt ( j ) == 'I' ) && ( j != 0 ) ) {
          break ;
        }
      }
    }
  }
  return result . toString ( ) ;
}

