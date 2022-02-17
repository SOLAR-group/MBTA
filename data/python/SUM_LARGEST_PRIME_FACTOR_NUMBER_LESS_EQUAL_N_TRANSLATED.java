====================
public static int f_gold ( int n ) {
  int [ ] prime = new int [ n + 1 ] ;
  prime [ 0 ] = 0 ;
  int sum = 0 ;
  int max = ( int ) ( n / 2 ) ;
  for ( int p = 2 ;
  p <= max ;
  p ++ ) {
    if ( prime [ p ] == 0 ) {
      for ( int i = p * 2 ;
      i <= n ;
      i += p ) {
        prime [ i ] = p ;
      }
    }
  }
  for ( int p = 2 ;
  p <= n ;
  p ++ ) {
    if ( prime [ p ] > 0 ) {
      sum += prime [ p ] ;
    }
    else {
      sum += p ;
    }
  }
  return sum ;
}

