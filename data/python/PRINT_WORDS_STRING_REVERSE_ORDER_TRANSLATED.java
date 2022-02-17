====================
public static String f_gold ( String str ) {
  int i = str . length ( ) - 1 ;
  int start = end = i + 1 ;
  StringBuffer sb = new StringBuffer ( ) ;
  while ( i >= 0 ) {
    if ( str . charAt ( i ) == ' ' ) {
      start = i + 1 ;
      while ( start != end ) {
        sb . append ( str . charAt ( start ) ) ;
        start ++ ;
      }
      sb . append ( ' ' ) ;
      end = i ;
    }
    i -- ;
  }
  start = 0 ;
  while ( start != end ) {
    sb . append ( str . charAt ( start ) ) ;
    start ++ ;
  }
  return sb . toString ( ) ;
}

