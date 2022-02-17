====================
public static String f_gold ( String s , char c1 , char c2 ) {
  int l = s . length ( ) ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    if ( ( s . charAt ( i ) == c1 ) && ( s . charAt ( i + 1 ) == c2 ) ) {
      s = s . substring ( 0 , i ) + c2 + s . substring ( i + 1 ) ;
    }
    else if ( ( s . charAt ( i ) == c2 ) && ( s . charAt ( i + 1 ) == c1 ) ) {
      s = s . substring ( 0 , i ) + c1 + s . substring ( i + 1 ) ;
    }
  }
  return s ;
}

