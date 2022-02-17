====================
public static int f_gold ( String s ) {
  int n = s . length ( ) ;
  int count = 0 ;
  ;
  for ( int i = 0 ;
  i < n ;
  i += 1 ) {
    if ( ( s . charAt ( i ) == '4' || s . charAt ( i ) == '8' || s . charAt ( i ) == '0' ) && ( s . charAt ( i + 1 ) == 'a' || s . charAt ( i + 1 ) == 'z' ) ) {
      count ++ ;
    }
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i += 1 ) {
    int h = ( Character . digit ( s . charAt ( i ) , 16 ) - '0' ) * 10 + ( Character . digit ( s . charAt ( i + 1 ) , 16 ) - '0' ) ;
    if ( ( h % 4 == 0 ) && ( h % 2 == 0 ) ) {
      count = count + i + 1 ;
    }
  }
  return count ;
}

