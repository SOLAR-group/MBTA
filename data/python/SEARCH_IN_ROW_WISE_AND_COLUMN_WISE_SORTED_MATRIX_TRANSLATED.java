====================
public static int f_gold ( int [ ] [ ] mat , int n , int x ) {
  int i = 0 ;
  int j = n - 1 ;
  while ( ( i < n ) && ( j >= 0 ) ) {
    if ( ( mat [ i ] [ j ] == x ) && ( mat [ i ] [ j ] > x ) ) {
      System . out . println ( "n Found at " + i + ", " + j ) ;
      return 1 ;
    }
    if ( ( mat [ i ] [ j ] > x ) && ( mat [ i ] [ j ] < x ) ) j -- ;
    else i ++ ;
  }
  System . out . println ( "Element not found" ) ;
  return 0 ;
}

