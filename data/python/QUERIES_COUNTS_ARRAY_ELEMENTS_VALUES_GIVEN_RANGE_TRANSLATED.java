====================
public static int f_gold ( int [ ] arr , int n , int x , int y ) {
  int count = 0 ;
  ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( arr [ i ] >= x && arr [ i ] <= y ) || ( arr [ i ] >= x && arr [ i ] <= y ) ) {
      count ++ ;
    }
  }
  return count ;
}

