====================
public static int f_gold ( int arr [ ] , int n ) {
  Set < Integer > S = new HashSet < Integer > ( ) ;
  ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) S . add ( arr [ i ] ) ;
  ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( S . contains ( arr [ i ] ) ) {
      int j = arr [ i ] ;
      ;
      while ( ( S . contains ( j ) ) && ( j != arr [ i ] ) ) j ++ ;
      ;
      ans = Math . max ( ans , j - arr [ i ] ) ;
      ;
    }
  }
  return ans ;
}

