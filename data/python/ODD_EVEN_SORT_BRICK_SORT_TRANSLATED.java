====================
public static void f_gold ( int arr [ ] , int n ) {
  int isSorted = 0 ;
  while ( isSorted == 0 ) {
    isSorted = 1 ;
    int temp = 0 ;
    for ( int i = 1 ;
    i < n - 1 ;
    i += 2 ) {
      if ( arr [ i ] > arr [ i + 1 ] ) {
        arr [ i ] = arr [ i + 1 ] ;
        isSorted = 0 ;
      }
    }
    for ( int i = 0 ;
    i < n - 1 ;
    i += 2 ) {
      if ( arr [ i ] > arr [ i + 1 ] ) {
        arr [ i ] = arr [ i + 1 ] ;
        isSorted = 0 ;
      }
    }
  }
  return ;
}

