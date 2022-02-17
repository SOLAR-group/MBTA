====================
static void f_gold ( int [ ] arr , int n , int A , int B , int C ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) arr [ i ] = ( A * arr [ i ] * arr [ i ] + B * arr [ i ] + C ) ;
  int index = - ( Integer . MAX_VALUE - 1 ) ;
  int maximum = - ( Integer . MAX_VALUE - 1 ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( maximum < arr [ i ] ) {
      index = i ;
      maximum = arr [ i ] ;
    }
  }
  int i = 0 ;
  int j = n - 1 ;
  int [ ] newArr = new int [ n ] ;
  int k = 0 ;
  while ( i < index && j > index ) {
    if ( arr [ i ] < arr [ j ] ) {
      newArr [ k ] = arr [ i ] ;
      k ++ ;
      i ++ ;
    }
    else {
      newArr [ k ] = arr [ j ] ;
      k ++ ;
      j -- ;
    }
  }
  while ( i < index ) {
    newArr [ k ] = arr [ i ] ;
    k ++ ;
    i ++ ;
  }
  while ( j > index ) {
    newArr [ k ] = arr [ j ] ;
    k ++ ;
    j -- ;
    newArr [ n - 1 ] = maximum ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) arr [ i ] = newArr [ i ] ;
}

