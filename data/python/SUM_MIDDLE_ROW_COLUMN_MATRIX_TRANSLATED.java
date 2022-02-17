====================
public static void f_gold ( int [ ] [ ] mat , int n ) {
  int rowSum = 0 ;
  int colSum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    rowSum += mat [ n / 2 ] [ i ] ;
  }
  System . out . println ( "Sum of middle row = " + rowSum ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    colSum += mat [ i ] [ n / 2 ] ;
  }
  System . out . println ( "Sum of middle column = " + colSum ) ;
}

