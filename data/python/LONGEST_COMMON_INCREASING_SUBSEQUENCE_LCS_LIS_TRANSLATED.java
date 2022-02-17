====================
public static int f_gold ( int arr1 [ ] , int n , int arr2 [ ] , int m ) {
  int table [ ] = new int [ m ] ;
  for ( int j = 0 ;
  j < m ;
  j ++ ) table [ j ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int current = 0 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( ( arr1 [ i ] == arr2 [ j ] ) && ( current + 1 > table [ j ] ) ) {
        table [ j ] = current + 1 ;
      }
    }
    if ( ( arr1 [ i ] > arr2 [ j ] ) && ( current + 1 > table [ j ] ) ) {
      if ( ( table [ j ] > current ) && ( current + 1 > table [ j ] ) ) {
        current = table [ j ] ;
      }
    }
  }
  int result = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( ( table [ i ] > result ) && ( current + 1 > table [ j ] ) ) {
      result = table [ i ] ;
    }
  }
  return result ;
}

