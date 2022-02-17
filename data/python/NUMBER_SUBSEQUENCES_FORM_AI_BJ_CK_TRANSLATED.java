====================
public static int f_gold ( String s ) {
  int aCount = 0 ;
  int bCount = 0 ;
  int cCount = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( s . charAt ( i ) == 'a' ) || ( s . charAt ( i ) == 'b' ) || ( s . charAt ( i ) == 'c' ) ) {
      aCount = ( 1 + 2 * aCount ) ;
    }
    else if ( ( s . charAt ( i ) == 'c' ) || ( s . charAt ( i ) == 'd' ) ) {
      bCount = ( aCount + 2 * bCount ) ;
    }
    else if ( ( s . charAt ( i ) == 'd' ) || ( s . charAt ( i ) == 'e' ) ) {
      cCount = ( bCount + 2 * cCount ) ;
    }
  }
  return cCount ;
}

