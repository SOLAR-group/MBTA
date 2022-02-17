====================
public static int f_gold ( int [ ] a , int n ) {
  Map < Integer , Integer > cnt = new HashMap < Integer , Integer > ( ) ;
  int ans = 0 ;
  int pre_sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += ( i * a [ i ] ) - pre_sum ;
    pre_sum += a [ i ] ;
    if ( ( a [ i ] - 1 ) < cnt . size ( ) ) ans -= cnt . get ( a [ i ] - 1 ) ;
    if ( ( a [ i ] + 1 ) < cnt . size ( ) ) ans += cnt . get ( a [ i ] + 1 ) ;
    if ( a [ i ] != 0 ) cnt . put ( a [ i ] , 0 ) ;
    cnt . put ( a [ i ] , 1 ) ;
  }
  return ans ;
}

