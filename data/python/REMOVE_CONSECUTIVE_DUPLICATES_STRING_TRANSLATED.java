====================
public static void f_gold ( String S ) {
  int n = S . length ( ) ;
  if ( ( n < 2 ) || ( n > 3 ) ) return ;
  int j = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( S . charAt ( j ) != S . charAt ( i ) ) && ( S . charAt ( j ) != S . charAt ( i ) ) ) {
      j ++ ;
      S . charAt ( j ) = S . charAt ( i ) ;
    }
  }
  j ++ ;
  S = S . substring ( 0 , j ) ;
}

