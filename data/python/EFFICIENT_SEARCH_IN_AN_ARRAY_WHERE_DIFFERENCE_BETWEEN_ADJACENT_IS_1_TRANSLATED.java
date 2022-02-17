====================
public static int f_gold ( int [ ] arr , int n , int x ) {
  int i = 0 ;
  while ( ( i <= n - 1 ) && ( arr [ i ] == x ) ) {
    if ( ( arr [ i ] == x ) || ( arr [ i ] == - 1 ) ) {
      return i ;
    }
    i += Math . abs ( arr [ i ] - x ) ;
  }
  return - 1 ;
}

