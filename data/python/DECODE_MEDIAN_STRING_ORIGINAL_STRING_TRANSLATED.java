====================
public static String f_gold ( String s ) {
  int l = s . length ( ) ;
  String s1 = "" ;
  if ( ( l % 2 == 0 ) && ( s . charAt ( l - 1 ) == ' ' ) ) {
    boolean isEven = true ;
    if ( ( l - 1 ) % 2 == 0 ) {
      s1 = s . charAt ( i ) + s1 ;
      s1 += s . charAt ( i + 1 ) ;
    }
    else {
      if ( ( l - i > 1 ) && ( s . charAt ( i ) == ' ' ) ) {
        s1 += s . charAt ( i ) ;
        s1 = s . charAt ( i + 1 ) + s1 ;
      }
      else {
        s1 += s . charAt ( i ) ;
      }
    }
  }
  return s1 ;
}

