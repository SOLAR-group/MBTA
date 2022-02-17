====================
public static int f_gold ( String n ) {
  int i = 0 ;
  int j = n . length ( ) ;
  int pos = 0 ;
  while ( ( i < j ) && ( i < n . length ( ) ) ) {
    if ( ( n . charAt ( i ) == '4' ) || ( n . charAt ( i ) == '7' ) ) pos = pos * 2 + 1 ;
    if ( ( n . charAt ( i ) == '2' ) || ( n . charAt ( i ) == '3' ) ) pos = pos * 2 + 2 ;
    i = i + 1 ;
  }
  return pos ;
}

