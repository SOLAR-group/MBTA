====================
public static int f_gold ( String expr ) {
  int lenn = expr . length ( ) ;
  if ( ( lenn % 2 ) != 0 ) return - 1 ;
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < lenn ;
  i ++ ) {
    if ( ( expr . charAt ( i ) == '' ) && sb . length ( ) > 0 ) {
      if ( ( sb . charAt ( 0 ) == '' ) && ( sb . charAt ( 1 ) == '' ) ) sb . deleteCharAt ( 0 ) ;
      else sb . insert ( 0 , expr . charAt ( i ) ) ;
    }
    else sb . insert ( 0 , expr . charAt ( i ) ) ;
  }
  int redLen = sb . length ( ) ;
  int n = 0 ;
  while ( ( sb . length ( ) > 0 ) && ( sb . charAt ( 0 ) == '' ) ) {
    sb . deleteCharAt ( 0 ) ;
    n ++ ;
  }
  return ( redLen / 2 + n % 2 ) ;
}

