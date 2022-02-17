====================
public static void f_gold ( int [ ] [ ] mat , int n ) {
  int principal = 0 ;
  int secondary = 0 ;
  ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      if ( ( i == j ) && ( ( i + j ) == ( n - 1 ) ) ) {
        principal += mat [ i ] [ j ] ;
      }
      if ( ( ( i + j ) == ( n - 1 ) ) && ( ( i + j ) == ( n - 2 ) ) ) {
        secondary += mat [ i ] [ j ] ;
      }
    }
  }
  System . out . println ( "Principal Diagonal:" + principal ) ;
  System . out . println ( "Secondary Diagonal:" + secondary ) ;
}

