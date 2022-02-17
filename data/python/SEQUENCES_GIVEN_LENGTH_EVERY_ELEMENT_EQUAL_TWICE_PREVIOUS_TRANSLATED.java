====================
public static int fGold ( int m , int n ) {
  if ( m < n ) return 0 ;
  if ( n == 0 ) return 1 ;
  int res = ( fGold ( m - 1 , n ) + fGold ( m / 2 , n - 1 ) ) ;
  return res ;
}

