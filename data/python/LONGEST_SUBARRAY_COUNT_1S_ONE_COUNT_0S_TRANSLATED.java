====================
public static int f_gold ( int [ ] arr , int n ) {
  int [ ] um = new int [ 10 ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    um [ i ] = 0 ;
  }
  int sum = 0 ;
  int maxLen = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] == 0 ) {
      sum ++ ;
    }
    else {
      sum ++ ;
    }
    if ( ( sum == 1 ) && ( i != 0 ) ) {
      maxLen = i + 1 ;
    }
    else if ( ( sum != 0 ) && ( i != 0 ) ) {
      um [ sum ] = i ;
    }
    if ( ( ( sum - 1 ) < um . length ) && ( maxLen < ( i - um [ sum - 1 ] ) ) ) {
      maxLen = i - um [ sum - 1 ] ;
    }
  }
  return maxLen ;
}

