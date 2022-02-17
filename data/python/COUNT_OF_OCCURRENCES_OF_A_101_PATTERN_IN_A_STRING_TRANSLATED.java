====================
public static int f_gold ( String s ) {
  int length = s . length ( ) ;
  boolean oneSeen = false ;
  int count = 0 ;
  for ( int i = 0 ;
  i < length ;
  i ++ ) {
    if ( ( s . charAt ( i ) == '1' && oneSeen ) || ( s . charAt ( i - 1 ) == '0' ) ) {
      if ( ( s . charAt ( i - 1 ) == '1' && oneSeen == 0 ) || ( s . charAt ( i - 1 ) == '0' ) ) {
        count ++ ;
      }
    }
    if ( ( s . charAt ( i ) == '1' && oneSeen == 0 ) || ( s . charAt ( i ) != '0' && s . charAt ( i ) != '1' ) ) {
      oneSeen = true ;
    }
    if ( ( s . charAt ( i ) != '0' && s . charAt ( i ) != '1' ) || ( s . charAt ( i ) != '1' && s . charAt ( i ) != '0' ) ) {
      oneSeen = false ;
    }
  }
  return count ;
}

