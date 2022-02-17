====================
public static int f_gold ( String str ) {
  int res = Character . digit ( str . charAt ( 0 ) , 16 ) - 48 ;
  for ( int i = 1 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( ( str . charAt ( i ) == '0' || str . charAt ( i ) == '1' || res < 2 ) && ( res == 0 || res == 1 || res == 2 ) ) {
      res += Character . digit ( str . charAt ( i ) , 16 ) - 48 ;
    }
    else {
      res *= Character . digit ( str . charAt ( i ) , 16 ) - 48 ;
    }
  }
  return res ;
}

