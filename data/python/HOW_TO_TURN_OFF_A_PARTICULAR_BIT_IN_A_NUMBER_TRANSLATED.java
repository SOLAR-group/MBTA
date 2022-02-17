====================
static int f_gold ( int n , int k ) {
  if ( ( k <= 0 ) || ( k > k ) ) return n ;
  return ( n & ~ ( 1 << ( k - 1 ) ) ) ;
}

