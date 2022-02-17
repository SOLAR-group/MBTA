====================
public static int f_gold ( int [ ] arr , int n , int sum ) {
  int currSum = arr [ 0 ] ;
  int start = 0 ;
  int i = 1 ;
  while ( i <= n ) {
    while ( currSum > sum && start < i - 1 ) {
      currSum = currSum - arr [ start ] ;
      start ++ ;
    }
    if ( currSum == sum ) {
      System . out . println ( "Sum found between indexes" ) ;
      System . out . println ( start + " and " + i - 1 ) ;
      return 1 ;
    }
    if ( i < n ) currSum = currSum + arr [ i ] ;
    i ++ ;
  }
  System . out . println ( "No subarray found" ) ;
  return 0 ;
}

