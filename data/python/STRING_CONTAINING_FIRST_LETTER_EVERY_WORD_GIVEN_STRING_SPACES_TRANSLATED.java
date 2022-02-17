====================
public static String f_gold ( String str ) {
  String result = "" ;
  boolean v = true ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( ( str . charAt ( i ) == ' ' ) || ( str . charAt ( i ) == '\t' ) ) {
      v = true ;
    }
    else if ( ( str . charAt ( i ) != ' ' ) && v == true ) {
      result += ( str . charAt ( i ) ) ;
      v = false ;
    }
  }
  return result ;
}

