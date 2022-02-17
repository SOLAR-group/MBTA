====================
public static int fGold ( int n , int k , int x ) {
  List < Integer > dp = Lists . newArrayList ( ) ;
  dp . add ( 0 ) ;
  dp . add ( 1 ) ;
  int i = 2 ;
  while ( i < n ) {
    dp . add ( ( k - 2 ) * dp . get ( i - 1 ) + ( k - 1 ) * dp . get ( i - 2 ) ) ;
    i = i + 1 ;
  }
  return ( ( k - 1 ) * dp . get ( n - 2 ) == 1 ? 1 : dp . get ( n - 1 ) ) ;
}

