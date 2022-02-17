====================
public static int f_gold ( int [ ] a , int n , int l , int r ) {
  int count = 0 ;
  for ( int i = l ;
  i < r ;
  i ++ ) {
    if ( ( a [ i ] == a [ i + 1 ] ) && ( a [ i + n ] == a [ i + n ] ) ) {
      count ++ ;
    }
  }
  return count ;
}

