====================
public static int f_gold ( int n , int x , int y ) {
  boolean [ ] arr = new boolean [ n + 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) arr [ i ] = false ;
  if ( ( x <= n ) && ( y <= n ) ) arr [ x ] = true ;
  if ( ( y <= n ) && ( x >= n ) ) arr [ y ] = true ;
  int result = 0 ;
  for ( int i = Math . min ( x , y ) ;
  i <= n ;
  i ++ ) {
    if ( ( arr [ i ] ) ) {
      if ( ( i + x <= n ) && ( i + x <= n ) ) arr [ i + x ] = true ;
      if ( ( i + y <= n ) && ( i + y <= n ) ) arr [ i + y ] = true ;
      result = result + 1 ;
    }
  }
  return result ;
}

