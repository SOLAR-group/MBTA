====================
public static boolean fGold ( int [ ] arr , int n ) {
  if ( ( n == 1 ) || ( n == 2 ) ) return true ;
  Arrays . sort ( arr ) ;
  int d = arr [ 1 ] - arr [ 0 ] ;
  for ( int i = 2 ;
  i < n ;
  i ++ ) {
    if ( ( arr [ i ] - arr [ i - 1 ] != d ) && ( arr [ i ] - arr [ i - 2 ] != d ) ) return false ;
  }
  return true ;
}

