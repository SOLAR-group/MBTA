====================
public static void fGold ( int [ ] [ ] mat , int n ) {
  int principal = 0 ;
  int secondary = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    principal += mat [ i ] [ i ] ;
    secondary += mat [ i ] [ n - i - 1 ] ;
  }
  System . out . println ( "Principal Diagonal:" + principal ) ;
  System . out . println ( "Secondary Diagonal:" + secondary ) ;
}

