====================
public static int f_gold ( int [ ] A , int K ) {
  int n = A . length ;
  ;
  int [ ] preSum = new int [ n + 1 ] ;
  preSum [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) preSum [ i + 1 ] = preSum [ i ] + A [ i ] ;
  ;
  int [ ] dp = new int [ n ] ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) dp [ i ] = ( preSum [ n ] - preSum [ i ] ) / ( n - i ) ;
  ;
  for ( int k = 0 ;
  k < K - 1 ;
  k ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = i + 1 ;
      j < n ;
      j ++ ) {
        dp [ i ] = Math . max ( dp [ i ] , ( preSum [ j ] - preSum [ i ] ) / ( j - i ) + dp [ j ] ) ;
      };
    }
  }
  return ( int ) dp [ 0 ] ;
}

