====================
public static int f_gold ( int [ ] arr , int n , int k ) {
  int distCount = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int j = 0 ;
    while ( j < n ) {
      if ( ( i != j && arr [ j ] == arr [ i ] ) || ( j == n ) ) break ;
      j ++ ;
    }
    if ( ( j == n ) && ( arr [ j ] == arr [ i ] ) ) distCount ++ ;
    if ( ( distCount == k ) && ( arr [ i ] == arr [ j ] ) ) return arr [ i ] ;
  }
  return - 1 ;
}

