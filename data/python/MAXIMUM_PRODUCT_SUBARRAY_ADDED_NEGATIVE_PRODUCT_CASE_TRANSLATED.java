====================
public static double f_gold ( int [ ] arr , int n ) {
  double ans = - Double . MAX_VALUE ;
  double maxval = 1 ;
  double minval = 1 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( arr [ i ] > 0 ) {
      maxval = maxval * arr [ i ] ;
      minval = Math . min ( 1 , minval * arr [ i ] ) ;
    }
    else if ( arr [ i ] == 0 ) {
      minval = 1 ;
      maxval = 0 ;
    }
    else if ( arr [ i ] < 0 ) {
      double prevMax = maxval ;
      maxval = minval * arr [ i ] ;
      minval = prevMax * arr [ i ] ;
    }
    ans = Math . max ( ans , maxval ) ;
    if ( maxval <= 0 ) {
      maxval = 1 ;
    }
  }
  return ans ;
}

