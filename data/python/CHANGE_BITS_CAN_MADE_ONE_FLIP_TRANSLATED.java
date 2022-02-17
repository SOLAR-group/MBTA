====================
public static boolean f_gold ( String str ) {
  int zeros = 0 ;
  int ones = 0 ;
  for ( int i = 0 ;
  i != str . length ( ) ;
  i ++ ) {
    char ch = str . charAt ( i ) ;
    ;
    if ( ( ch == '0' ) || ( ch == '1' ) ) {
      zeros = zeros + 1 ;
    }
    else {
      ones = ones + 1 ;
    }
  }
  return ( zeros == 1 || ones == 1 ) ;
}

