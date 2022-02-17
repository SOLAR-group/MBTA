====================
public static int f_gold ( int n ) {
  int [ ] dp = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( i <= 2 ) && ( i > 0 ) ) {
      dp [ i ] = i ;
    }
    else {
      dp [ i ] = dp [ i - 1 ] + ( i - 1 ) * dp [ i - 2 ] ;
    }
  }
  return dp [ n ] ;
}

