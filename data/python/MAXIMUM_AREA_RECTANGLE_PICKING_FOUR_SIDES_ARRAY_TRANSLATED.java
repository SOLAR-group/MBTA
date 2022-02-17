====================
public static int f_gold ( int [ ] arr , int n ) {
  Arrays . sort ( arr , 0 , n ) ;
  int [ ] dimension = {
    0 , 0 };
    int i = 0 ;
    int j = 0 ;
    while ( ( i < n - 1 && j < 2 ) || ( i < n - 1 && j < 2 ) ) {
      if ( ( arr [ i ] == arr [ i + 1 ] ) && ( arr [ j ] == arr [ i ] ) ) {
        dimension [ j ] = arr [ i ] ;
        j ++ ;
        i ++ ;
      }
      i ++ ;
    }
    return ( dimension [ 0 ] * dimension [ 1 ] ) ;
  }
  
