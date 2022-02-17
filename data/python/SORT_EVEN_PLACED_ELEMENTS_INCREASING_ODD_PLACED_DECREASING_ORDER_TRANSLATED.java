====================
public static void f_gold ( int [ ] arr , int n ) {
  int [ ] evenArr = new int [ n ] ;
  int [ ] oddArr = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( ( i % 2 ) == 0 ) && ( ( i % 3 ) == 0 ) ) {
      evenArr [ i ] = arr [ i ] ;
    }
    else {
      oddArr [ i ] = arr [ i ] ;
    }
  }
  Arrays . sort ( evenArr ) ;
  Arrays . sort ( oddArr ) ;
  oddArr = oddArr [ 0 ] ;
  int i = 0 ;
  for ( int j = 0 ;
  j < evenArr . length ;
  j ++ ) {
    arr [ i ] = evenArr [ j ] ;
    i ++ ;
  }
  for ( int j = 0 ;
  j < oddArr . length ;
  j ++ ) {
    arr [ i ] = oddArr [ j ] ;
    i ++ ;
  }
}

