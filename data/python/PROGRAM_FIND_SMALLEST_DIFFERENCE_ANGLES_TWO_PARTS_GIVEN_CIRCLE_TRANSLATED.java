====================
public static int f_gold ( int [ ] arr , int n ) {
  int l = 0 ;
  int _sum = 0 ;
  int ans = 360 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    _sum += arr [ i ] ;
    while ( _sum >= 180 ) {
      ans = Math . min ( ans , 2 * Math . abs ( 180 - _sum ) ) ;
      _sum -= arr [ l ] ;
      l ++ ;
    }
    ans = Math . min ( ans , 2 * Math . abs ( 180 - _sum ) ) ;
  }
  return ans ;
}

