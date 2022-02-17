====================
public static int f_gold ( int [ ] arr , int arrSize ) {
  for ( int i = 0 ;
  i <= arrSize ;
  i ++ ) {
    int count = 0 ;
    for ( int j = 0 ;
    j <= arrSize ;
    j ++ ) {
      if ( arr [ i ] == arr [ j ] ) {
        count ++ ;
      }
    }
    if ( ( count % 2 != 0 ) && ( count % 2 != 0 ) ) {
      return arr [ i ] ;
    }
  }
  return - 1 ;
}

