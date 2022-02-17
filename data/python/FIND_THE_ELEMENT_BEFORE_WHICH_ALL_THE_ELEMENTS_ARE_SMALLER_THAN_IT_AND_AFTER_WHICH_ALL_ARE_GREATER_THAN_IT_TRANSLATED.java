====================
public static int fGold ( int [ ] arr , int n ) {
  int [ ] leftMax = new int [ n ] ;
  leftMax [ 0 ] = Integer . MIN_VALUE ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    leftMax [ i ] = Math . max ( leftMax [ i - 1 ] , arr [ i - 1 ] ) ;
  }
  int rightMin = Integer . MIN_VALUE ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    if ( leftMax [ i ] < arr [ i ] && rightMin > arr [ i ] ) {
      return i ;
    }
    rightMin = Math . min ( rightMin , arr [ i ] ) ;
  }
  return - 1 ;
}

