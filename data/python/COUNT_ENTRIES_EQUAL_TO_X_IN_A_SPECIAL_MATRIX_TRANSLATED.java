====================
public static int f_gold ( int n , int x ) {
  int cnt = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( i <= x ) {
      if ( x / i <= n && x % i == 0 ) {
        cnt ++ ;
      }
    }
  }
  return cnt ;
}

