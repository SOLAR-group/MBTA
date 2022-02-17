====================
public static void f_gold ( int [ ] arr , int n ) {
  Arrays . sort ( arr ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i += 2 ) {
    arr [ i ] = arr [ i + 1 ] ;
    arr [ i + 1 ] = arr [ i ] ;
  }
}

