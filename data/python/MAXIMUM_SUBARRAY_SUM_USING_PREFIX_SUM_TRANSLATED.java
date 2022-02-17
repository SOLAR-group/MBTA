====================
public static double fGold ( int [ ] arr , int n ) {
  double minPrefixSum = 0 ;
  double res = - Double . MAX_VALUE ;
  int [ ] prefixSum = new int [ n ] ;
  prefixSum [ 0 ] = arr [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    prefixSum [ i ] = prefixSum [ i - 1 ] + arr [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    res = Math . max ( res , prefixSum [ i ] - minPrefixSum ) ;
    minPrefixSum = Math . min ( minPrefixSum , prefixSum [ i ] ) ;
  }
  return res ;
}

