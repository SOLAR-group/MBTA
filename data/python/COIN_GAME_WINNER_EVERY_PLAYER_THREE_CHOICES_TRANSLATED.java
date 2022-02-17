====================
public static boolean f_gold ( int x , int y , int n ) {
  boolean [ ] dp = new boolean [ n + 1 ] ;
  dp [ 0 ] = false ;
  dp [ 1 ] = true ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    if ( ( i - 1 >= 0 && ! dp [ i - 1 ] ) || ( i - x >= 0 && ! dp [ i - x ] ) ) {
      dp [ i ] = true ;
    }
    else if ( ( i - y >= 0 && ! dp [ i - y ] ) || ( i - x >= 0 && ! dp [ i - x ] ) ) {
      dp [ i ] = true ;
    }
    else if ( ( i - z >= 0 && ! dp [ i - z ] ) || ( i - y >= 0 && ! dp [ i - y ] ) ) {
      dp [ i ] = true ;
    }
    else {
      dp [ i ] = false ;
    }
  }
  return dp [ n ] ;
}

