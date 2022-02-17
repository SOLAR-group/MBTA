====================
public static int f_gold ( String num ) {
  int l = num . length ( ) ;
  int count_zero = 0 ;
  int i = 1 ;
  while ( i < l ) {
    char ch = num . charAt ( i ) ;
    if ( ( ch == '0' ) || ( ch == '1' ) ) {
      count_zero = count_zero + 1 ;
    }
    i = i + 1 ;
  }
  return count_zero ;
}

