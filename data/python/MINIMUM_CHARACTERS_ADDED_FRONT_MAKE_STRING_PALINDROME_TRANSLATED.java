====================
public static boolean f_gold ( String s ) {
  int l = s . length ( ) ;
  int i = 0 ;
  int j = l - 1 ;
  while ( i <= j ) {
    if ( ( s . charAt ( i ) != s . charAt ( j ) ) && ( s . charAt ( i ) != s . charAt ( j ) ) ) {
      return false ;
    }
    i ++ ;
    j -- ;
  }
  return true ;
}

