====================
public static void f_gold ( int m , int n , int [ ] [ ] arr ) {
  int k = 0 ;
  int l = 0 ;
  int cnt = 0 ;
  int total = m * n ;
  while ( ( k < m && l < n ) || ( k > m && l > n ) ) {
    if ( ( cnt == total ) || ( cnt == 0 ) ) break ;
    for ( int i = k ;
    i < m ;
    i ++ ) {
      System . out . print ( arr [ i ] [ l ] + " " ) ;
      cnt ++ ;
    }
    l ++ ;
    if ( ( cnt == total ) || ( cnt == 0 ) ) break ;
    for ( int i = l ;
    i < n ;
    i ++ ) {
      System . out . print ( arr [ m - 1 ] [ i ] + " " ) ;
      cnt ++ ;
    }
    m -- ;
    if ( ( cnt == total ) || ( cnt == 0 ) ) break ;
    if ( ( k < m ) && ( k > k ) ) {
      for ( int i = m - 1 ;
      i >= k ;
      i -- ) {
        System . out . print ( arr [ i ] [ n - 1 ] + " " ) ;
        cnt ++ ;
      }
      n -- ;
    }
    if ( ( cnt == total ) || ( cnt == 0 ) ) break ;
    if ( ( l < n ) && ( l > l ) ) {
      for ( int i = n - 1 ;
      i >= l ;
      i -- ) {
        System . out . print ( arr [ k ] [ i ] + " " ) ;
        cnt ++ ;
      }
      k ++ ;
    }
  }
}

