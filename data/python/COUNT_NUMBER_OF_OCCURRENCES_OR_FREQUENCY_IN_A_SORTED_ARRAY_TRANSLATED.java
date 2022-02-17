====================
public static int f_gold ( int [ ] arr , int n , int x ) {
  int res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( x == arr [ i ] ) {
      res ++ ;
    }
  }
  return res ;
}

