====================
public static void f_gold ( int [ ] arr , int n ) {
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( ( arr [ i ] & 1 ) != 0 ) {
      arr [ i ] *= - 1 ;
    }
  }
  Arrays . sort ( arr ) ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( ( arr [ i ] & 1 ) != 0 ) {
      arr [ i ] *= - 1 ;
    }
  }
}

