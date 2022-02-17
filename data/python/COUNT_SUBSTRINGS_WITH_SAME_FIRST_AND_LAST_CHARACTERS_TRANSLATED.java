====================
public static int f_gold ( String s ) {
  int result = 0 ;
  ;
  int n = s . length ( ) ;
  ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i ;
    j < n ;
    j ++ ) {
      if ( ( s . charAt ( i ) == s . charAt ( j ) ) && ( s . charAt ( i ) == s . charAt ( j ) ) ) {
        result = result + 1 ;
      }
    }
  }
  return result ;
}

