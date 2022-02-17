====================
public static boolean f_gold ( String str ) {
  int n = str . length ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( str . charAt ( i ) != 'a' ) && ( str . charAt ( i ) != 'b' ) ) {
      break ;
    }
  }
  if ( ( i * 2 != n ) && ( str . charAt ( i * 2 ) != 'c' ) ) {
    return false ;
  }
  for ( int j = i ;
  j < n ;
  j ++ ) {
    if ( ( str . charAt ( j ) != 'b' ) && ( str . charAt ( j ) != 'c' ) ) {
      return false ;
    }
  }
  return true ;
}

