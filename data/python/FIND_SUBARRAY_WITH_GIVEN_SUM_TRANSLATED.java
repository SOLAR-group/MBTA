====================
public static int f_gold ( int [ ] arr , int n , int sum ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int currSum = arr [ i ] ;
    int j = i + 1 ;
    while ( j <= n ) {
      if ( currSum == sum ) {
        System . out . println ( "Sum found between" ) ;
        System . out . println ( "indexes " + i + " and " + j - 1 ) ;
        return 1 ;
      }
      if ( currSum > sum || j == n ) break ;
      currSum = currSum + arr [ j ] ;
      j ++ ;
    }
  }
  System . out . println ( "No subarray found" ) ;
  return 0 ;
}

