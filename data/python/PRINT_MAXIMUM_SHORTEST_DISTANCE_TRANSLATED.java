====================
public static int fGold ( int [ ] a , int n , int k ) {
  Map < Integer , Integer > b = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = a [ i ] ;
    int d = Math . min ( 1 + i , n - i ) ;
    if ( x != 0 ) {
      b . put ( x , d ) ;
    }
    else {
      b . put ( x , Math . min ( d , b . get ( x ) ) ) ;
    }
  }
  int ans = 10 * 9 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = a [ i ] ;
    if ( ( x != ( k - x ) && ( k - x ) < b . keySet ( ) . size ( ) ) || ( x != ( k - x ) && ( k - x ) < b . keySet ( ) . size ( ) ) ) {
      ans = Math . min ( Math . max ( b . get ( x ) , b . get ( k - x ) ) , ans ) ;
    }
  }
  return ans ;
}

