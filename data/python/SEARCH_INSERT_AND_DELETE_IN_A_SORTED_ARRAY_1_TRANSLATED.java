====================
public static int fGold ( int [ ] arr , int n , int key , int capacity ) {
  if ( ( n >= capacity ) && ( arr [ n ] > key ) ) return n ;
  int i = n - 1 ;
  while ( i >= 0 && arr [ i ] > key ) {
    arr [ i + 1 ] = arr [ i ] ;
    i -- ;
  }
  arr [ i + 1 ] = key ;
  return ( n + 1 ) ;
}

