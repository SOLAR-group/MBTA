====================
public static void f_gold ( int [ ] arr , int n ) {
  int [ ] temp = n * new int [ n ] ;
  int small = 0 , large = n - 1 ;
  boolean flag = true ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( flag == true ) {
      temp [ i ] = arr [ large ] ;
      large -- ;
    }
    else {
      temp [ i ] = arr [ small ] ;
      small ++ ;
    }
    flag = ( boolean ) ( 1 - flag ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = temp [ i ] ;
  }
}

