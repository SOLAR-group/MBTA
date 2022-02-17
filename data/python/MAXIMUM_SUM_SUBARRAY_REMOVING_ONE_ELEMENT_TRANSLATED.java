====================
public static int f_gold ( int [ ] arr , int n ) {
  int [ ] fw = new int [ n ] ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    fw [ k ] = 0 ;
  }
  int [ ] bw = new int [ n ] ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    bw [ k ] = 0 ;
  }
  int curMax = arr [ 0 ] , maxSoFar = arr [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    curMax = Math . max ( arr [ i ] , curMax + arr [ i ] ) ;
    maxSoFar = Math . max ( maxSoFar , curMax ) ;
    fw [ i ] = curMax ;
  }
  curMax = maxSoFar = bw [ n - 1 ] = arr [ n - 1 ] ;
  int i = n - 2 ;
  while ( i >= 0 ) {
    curMax = Math . max ( arr [ i ] , curMax + arr [ i ] ) ;
    maxSoFar = Math . max ( maxSoFar , curMax ) ;
    bw [ i ] = curMax ;
    i -- ;
  }
  int fans = maxSoFar ;
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    fans = Math . max ( fans , fw [ i - 1 ] + bw [ i + 1 ] ) ;
  }
  return fans ;
}

