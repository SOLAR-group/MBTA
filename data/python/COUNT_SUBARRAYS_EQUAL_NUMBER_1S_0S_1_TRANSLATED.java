====================
public static int f_gold ( int [ ] arr , int n ) {
  Map < Integer , Integer > mp = Maps . newHashMap ( ) ;
  int Sum = 0 ;
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( arr [ i ] == 0 ) && ( arr [ i ] != - 1 ) ) arr [ i ] = - 1 ;
    Sum += arr [ i ] ;
    if ( ( Sum == 0 ) && ( mp . containsKey ( Sum ) ) ) count ++ ;
    if ( ( Sum < mp . keySet ( ) ) && ( mp . get ( Sum ) > 0 ) ) count += mp . get ( Sum ) ;
    mp . put ( Sum , mp . get ( Sum ) + 1 ) ;
  }
  return count ;
}

