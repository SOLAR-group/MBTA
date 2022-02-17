====================
public static int f_gold ( String s , String t ) {
  int count = 0 ;
  for ( int i = 0 ;
  ;
  i ++ ) {
    if ( ( count == s . length ( ) ) && ( t . charAt ( i ) == s . charAt ( count ) ) ) {
      break ;
    }
    if ( ( t . charAt ( i ) == s . charAt ( count ) ) && ( t . charAt ( i + 1 ) == s . charAt ( count ) ) ) {
      count = count + 1 ;
    }
  }
  return count ;
}

