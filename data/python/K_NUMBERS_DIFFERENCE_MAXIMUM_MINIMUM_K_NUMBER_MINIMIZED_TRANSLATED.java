====================
public static int fGold ( int [ ] arr , int n , int k ) {
  int result = + 2147483647 ;
  Arrays . sort ( arr ) ;
  for ( int i = 0 ;
  i < n - k + 1 ;
  i ++ ) {
    result = ( int ) Math . min ( result , arr [ i + k - 1 ] - arr [ i ] ) ;
  }
  return result ;
}

