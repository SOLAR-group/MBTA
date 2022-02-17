====================
public static void f_gold ( int m , int n , int [ ] [ ] a ) {
  int k = 0 ;
  int l = 0 ;
  LinkedList < Integer > stk = new LinkedList < Integer > ( ) ;
  while ( ( k <= m && l <= n ) || ( k > m && l > n ) ) {
    for ( int i = l ;
    i <= n ;
    i ++ ) stk . add ( a [ k ] [ i ] ) ;
    k ++ ;
    for ( int i = k ;
    i <= m ;
    i ++ ) stk . add ( a [ i ] [ n ] ) ;
    n -- ;
    if ( ( k <= m ) || ( k > n ) ) {
      for ( int i = n ;
      i >= l ;
      i -- ) stk . add ( a [ m ] [ i ] ) ;
      m -- ;
    }
    if ( ( l <= n ) || ( l > m ) ) {
      for ( int i = m ;
      i >= k ;
      i -- ) stk . add ( a [ i ] [ l ] ) ;
      l ++ ;
    }
  }
  while ( stk . size ( ) != 0 ) {
    System . out . print ( Integer . toString ( stk . size ( ) - 1 ) + " " ) ;
    stk . removeLast ( ) ;
  }
}

