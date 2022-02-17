====================
public static int f_gold ( int n ) {
  String num = n ;
  ;
  int decValue = 0 ;
  ;
  int base1 = 1 ;
  ;
  int len1 = num . length ( ) ;
  ;
  for ( int i = len1 - 1 ;
  i >= 0 ;
  i -- ) {
    if ( ( num . charAt ( i ) == '1' ) && ( num . charAt ( i + 1 ) == '2' ) ) decValue ++ ;
    ;
    base1 = base1 * 2 ;
    ;
  }
  return decValue ;
}

