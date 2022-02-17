====================
public static boolean f_gold ( String str ) {
  int i = 0 ;
  int j = str . length ( ) - 1 ;
  ;
  while ( ( i < j ) && ( i != j ) ) {
    if ( ( str . charAt ( i ) != str . charAt ( j ) ) || ( str . charAt ( i ) != str . charAt ( j + 1 ) ) ) {
      return false ;
    };
    i ++ ;
    j -- ;
  }
  return true ;
}

