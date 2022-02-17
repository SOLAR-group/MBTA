====================
public static int f_gold ( int [ ] arr , int n , int k ) {
  if ( ( n == 1 ) || ( n == 2 ) ) return 0 ;
  Arrays . sort ( arr ) ;
  int ans = arr [ n - 1 ] - arr [ 0 ] ;
  int small = arr [ 0 ] + k ;
  int big = arr [ n - 1 ] - k ;
  if ( ( small > big ) && ( small < big ) ) small = big ;
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    int subtract = arr [ i ] - k ;
    int add = arr [ i ] + k ;
    if ( ( subtract >= small || add <= big ) && ( big - subtract <= add - small ) ) continue ;
    if ( ( big - subtract <= add - small ) && ( big - add <= small ) ) small = subtract ;
    else big = add ;
  }
  return Math . min ( ans , big - small ) ;
}

