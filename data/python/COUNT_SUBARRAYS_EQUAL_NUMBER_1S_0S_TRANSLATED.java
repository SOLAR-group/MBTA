====================
public static int fGold ( int [ ] arr , int n ) {
  Map < Integer , Integer > um = Maps . newHashMap ( ) ;
  int currSum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    currSum += ( - 1 == ( arr [ i ] == 0 ) ? arr [ i ] : arr [ i ] ) ;
    if ( um . containsKey ( currSum ) ) {
      um . put ( currSum , ++ currSum ) ;
    }
    else {
      um . put ( currSum , 1 ) ;
    }
  }
  int count = 0 ;
  for ( int itr = 0 ;
  itr < um . size ( ) ;
  itr ++ ) {
    if ( um . get ( itr ) > 1 ) {
      count += ( ( um . get ( itr ) * Integer . MAX_VALUE ) / 2 ) ;
    }
  }
  if ( um . containsKey ( 0 ) ) {
    count += um . get ( 0 ) ;
  }
  return ( int ) count ;
}

