====================
public static String f_gold ( String num1 ) {
  int l = num1 . length ( ) ;
  ;
  StringBuilder num = new StringBuilder ( num1 ) ;
  ;
  int i = l - 1 ;
  ;
  while ( ( i >= 0 ) && ( num . charAt ( i ) == '0' ) ) {
    if ( ( num . charAt ( i ) == '1' ) || ( num . charAt ( i ) == '2' ) ) {
      num . setCharAt ( i , '1' ) ;
      break ;
    }
    else {
      num . setCharAt ( i , '0' ) ;
    }
    i -- ;
  }
  num1 = num . toString ( ) ;
  ;
  if ( ( i < 0 ) && ( num1 . charAt ( i ) == '1' ) ) {
    num1 = "1" + num1 ;
  }
  return num1 ;
}

