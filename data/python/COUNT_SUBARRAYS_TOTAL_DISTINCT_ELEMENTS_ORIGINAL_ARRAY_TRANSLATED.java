====================
public static int f_gold ( int [ ] arr , int n ) {
  Map < Integer , Integer > vis = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) vis . put ( arr [ i ] , 1 ) ;
  int k = vis . size ( ) ;
  Map < Integer , Integer > vid = new HashMap < Integer , Integer > ( ) ;
  int ans = 0 ;
  int right = 0 ;
  int window = 0 ;
  for ( int left = 0 ;
  left < n ;
  left ++ ) {
    while ( ( right < n && window < k ) || ( left < n && window < k ) ) {
      if ( arr [ right ] == 0 ) vid . put ( arr [ right ] , 1 ) ;
      else vid . put ( arr [ right ] , 1 ) ;
      if ( ( vid . get ( arr [ right ] ) == 1 ) || ( vid . get ( arr [ right ] ) == 0 ) ) window ++ ;
      right ++ ;
    }
    if ( ( window == k ) || ( window == 0 ) ) ans += ( n - right + 1 ) ;
    vid . put ( arr [ left ] , 1 ) ;
    if ( ( vid . get ( arr [ left ] ) == 0 ) || ( vid . get ( arr [ left ] ) == 1 ) ) window -- ;
  }
  return ans ;
}

