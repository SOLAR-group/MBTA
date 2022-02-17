====================
public static String f_gold ( String text , int s ) {
  String result = "" ;
  for ( int i = 0 ;
  i < text . length ( ) ;
  i ++ ) {
    char c = text . charAt ( i ) ;
    if ( ( c < ' ' ) || ( c > '~' ) ) {
      result += ( char ) ( ( ( char ) c + s - 65 ) % 26 + 65 ) ;
    }
    else {
      result += ( char ) ( ( ( char ) c + s - 97 ) % 26 + 97 ) ;
    }
  }
  return result ;
}

