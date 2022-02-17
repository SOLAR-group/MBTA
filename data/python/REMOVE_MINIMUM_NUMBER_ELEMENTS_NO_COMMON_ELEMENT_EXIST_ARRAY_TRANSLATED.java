====================
public static int fGold ( int [ ] a , int [ ] b , int n , int m ) {
  Map < Integer , Integer > countA = Maps . newHashMapWithExpectedSize ( m ) ;
  Map < Integer , Integer > countB = Maps . newHashMapWithExpectedSize ( m ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    countA . put ( a [ i ] , countA . get ( a [ i ] ) + 1 ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    countB . put ( b [ i ] , countB . get ( b [ i ] ) + 1 ) ;
  }
  int res = 0 ;
  for ( int x : countA . keySet ( ) ) {
    if ( countB . containsKey ( x ) ) {
      res += Math . min ( countA . get ( x ) , countB . get ( x ) ) ;
    }
  }
  return res ;
}

