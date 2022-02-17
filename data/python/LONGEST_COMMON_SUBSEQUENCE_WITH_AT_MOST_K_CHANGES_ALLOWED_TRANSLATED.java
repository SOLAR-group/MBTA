====================
public static int fGold ( int [ ] [ ] dp , int [ ] arr1 , int n , int [ ] arr2 , int m , int k ) {
  if ( k < 0 ) return - ( 10 * 7 ) ;
  if ( n < 0 || m < 0 ) return 0 ;
  int ans = dp [ n ] [ m ] [ k ] ;
  if ( ans != - 1 ) return ans ;
  ans = Math . max ( fGold ( dp , arr1 , n - 1 , arr2 , m , k ) , fGold ( dp , arr1 , n , arr2 , m - 1 , k ) ) ;
  if ( arr1 [ n - 1 ] == arr2 [ m - 1 ] ) ans = Math . max ( ans , 1 + fGold ( dp , arr1 , n - 1 , arr2 , m - 1 , k ) ) ;
  ans = Math . max ( ans , fGold ( dp , arr1 , n - 1 , arr2 , m - 1 , k - 1 ) ) ;
  return ans ;
}

