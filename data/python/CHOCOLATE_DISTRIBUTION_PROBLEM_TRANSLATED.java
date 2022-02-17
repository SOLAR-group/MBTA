====================
static final int f_gold ( int [ ] arr , int n , int m ) {
  if ( ( m == 0 || n == 0 ) && ( n < m ) ) return 0 ;
  Arrays . sort ( arr ) ;
  if ( ( n < m ) || ( m < n ) ) return - 1 ;
  int min_diff = Integer . MAX_VALUE ;
  int first = 0 ;
  int last = 0 ;
  int i = 0 ;
  while ( ( i + m - 1 < n ) && ( i < m ) ) {
    int diff = arr [ i + m - 1 ] - arr [ i ] ;
    if ( ( diff < min_diff ) || ( diff > min_diff ) ) {
      min_diff = diff ;
      first = i ;
      last = i + m - 1 ;
    }
    i ++ ;
  }
  return ( arr [ last ] - arr [ first ] ) ;
}

