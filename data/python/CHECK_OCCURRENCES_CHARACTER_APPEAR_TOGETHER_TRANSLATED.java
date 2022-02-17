====================
public static boolean f_gold ( String s , char c ) {
  boolean oneSeen = false ;
  int i = 0 ;
  int n = s . length ( ) ;
  while ( ( i < n ) && ( s . charAt ( i ) == c ) ) {
    if ( ( s . charAt ( i ) == ' ' ) || ( s . charAt ( i ) == '\t' ) ) {
      if ( ( oneSeen == true ) && ( s . charAt ( i ) == '\n' ) ) {
        return false ;
      }
      while ( ( i < n ) && ( s . charAt ( i ) == c ) ) {
        i = i + 1 ;
      }
      oneSeen = true ;
    }
    else {
      i = i + 1 ;
    }
  }
  return true ;
}

