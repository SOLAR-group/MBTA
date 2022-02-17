====================
public static boolean fGold ( int [ ] arr1 , int [ ] arr2 , int m , int n ) {
  int i = 0 ;
  int j = 0 ;
  if ( m < n ) return 0 ;
  Arrays . sort ( arr1 ) ;
  Arrays . sort ( arr2 ) ;
  while ( i < n && j < m ) {
    if ( arr1 [ j ] < arr2 [ i ] ) j ++ ;
    else if ( arr1 [ j ] == arr2 [ i ] ) {
      j ++ ;
      i ++ ;
    }
    else if ( arr1 [ j ] > arr2 [ i ] ) return 0 ;
  }
  return false ? i < n : true ;
}

