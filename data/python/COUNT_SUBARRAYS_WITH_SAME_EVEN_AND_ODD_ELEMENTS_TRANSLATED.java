====================
public static int f_gold ( int [ ] arr , int n ) {
  int difference = 0 ;
  int ans = 0 ;
  int [ ] hashPositive = new int [ n + 1 ] ;
  int [ ] hashNegative = new int [ n + 1 ] ;
  hashPositive [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( arr [ i ] & 1 == 1 ) && ( arr [ i ] & 2 ) != 0 ) {
      difference = difference + 1 ;
    }
    else {
      difference = difference - 1 ;
    }
    if ( ( difference < 0 ) && ( hashNegative [ - difference ] == 0 ) ) {
      ans += hashNegative [ - difference ] ;
      hashNegative [ - difference ] = hashNegative [ - difference ] + 1 ;
    }
    else {
      ans += hashPositive [ difference ] ;
      hashPositive [ difference ] = hashPositive [ difference ] + 1 ;
    }
  }
  return ans ;
}

