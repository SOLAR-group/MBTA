====================
static int f_gold ( int n , int k ) {
  if ( ( n + 1 >= k ) && ( n + 1 - k ) <= ( k - 1 ) ) return ( k - 1 ) ;
  else return ( 2 * n + 1 - k ) ;
}

