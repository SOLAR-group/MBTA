====================
public static String f_gold ( String s ) {
  int n = s . length ( ) ;
  String s1 = "" ;
  s1 = s1 + s . charAt ( 0 ) . toLowerCase ( ) ;
  int i = 1 ;
  while ( i < n ) {
    if ( ( s . charAt ( i ) == ' ' ) && i <= n ) {
      s1 = s1 + " " + ( s . charAt ( i + 1 ) ) . toLowerCase ( ) ;
      i = i + 1 ;
    }
    else {
      s1 = s1 + ( s . charAt ( i ) ) . toUpperCase ( ) ;
    }
    i = i + 1 ;
  }
  return s1 ;
}

