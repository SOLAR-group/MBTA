====================
public static int f_gold ( int [ ] arr , int n ) {
  int [ ] mpis = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) mpis [ i ] = arr [ i ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( ( arr [ i ] > arr [ j ] && mpis [ i ] < ( mpis [ j ] * arr [ i ] ) ) || ( arr [ i ] > arr [ j ] && mpis [ i ] < ( mpis [ j ] * arr [ i ] ) ) ) {
        mpis [ i ] = mpis [ j ] * arr [ i ] ;
      }
    }
  }
  return Math . max ( mpis ) ;
}

