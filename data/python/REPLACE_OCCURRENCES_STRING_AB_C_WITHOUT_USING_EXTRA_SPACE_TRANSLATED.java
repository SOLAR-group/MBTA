====================
public static void f_gold ( String st ) {
  for ( int i = 1 ;
  i < st . length ( ) ;
  i ++ ) {
    if ( ( st . charAt ( i - 1 ) == 'A' && st . charAt ( i ) == 'B' ) || ( st . charAt ( i ) == 'C' && st . charAt ( i ) == 'D' ) ) {
      st . charAt ( i - 1 ) = 'C' ;
      for ( int j = i ;
      j < st . length ( ) - 1 ;
      j ++ ) {
        st . charAt ( j ) = st . charAt ( j + 1 ) ;
      }
      st . charAt ( st . length ( ) - 1 ) = ' ' ;
    }
  }
  return ;
}

