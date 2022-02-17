====================
public static int f_gold ( String str ) {
  int result = 0 ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( ( ( i == Character . MAX_VALUE ) || ( i == Character . MIN_VALUE ) ) && ( str . charAt ( i ) == ( char ) - 'a' ) ) {
      result ++ ;
    }
  }
  return result ;
}

