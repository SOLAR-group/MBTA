====================
public static int f_gold ( int a , int b ) {
  String s = Integer . toString ( b ) ;
  int i = 0 ;
  while ( i < ( s . length ( ) ) ) {
    if ( ( s . charAt ( i ) != '9' ) && ( s . charAt ( i ) != '.' ) ) break ;
    i ++ ;
  }
  int result ;
  if ( ( i == s . length ( ) ) && ( a == 0 ) ) result = a * s . length ( ) ;
  else result = a * ( s . length ( ) - 1 ) ;
  return result ;
}

