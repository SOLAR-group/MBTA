====================
public static final int fGold ( int [ ] arr , int n , int k ) {
  int [ ] sum = new int [ n + 1 ] ;
  sum [ 0 ] = 0 ;
  sum [ 1 ] = arr [ 0 ] ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    sum [ i ] = sum [ i - 1 ] + arr [ i - 1 ] ;
  }
  int [ ] Q = new int [ n + 1 ] ;
  heapify ( Q ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = i ;
    j <= n ;
    j ++ ) {
      int x = sum [ j ] - sum [ i - 1 ] ;
      if ( Q . length < k ) heappush ( Q , x ) ;
      else {
        if ( Q [ 0 ] < x ) {
          heappop ( Q ) ;
          heappush ( Q , x ) ;
        }
      }
    }
  }
  return Q [ 0 ] ;
}

