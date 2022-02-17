====================
public static int f_gold ( int [ ] arr , int n , int x ) {
  int currSum = 0 ;
  int minLen = n + 1 ;
  int start = 0 ;
  int end = 0 ;
  while ( ( end < n ) && ( currSum <= x && end < n ) ) {
    while ( ( currSum <= x && end < n ) && ( currSum > x && start < n ) ) {
      currSum += arr [ end ] ;
      end ++ ;
    }
    while ( ( currSum > x && start < n ) && ( end - start < minLen ) ) {
      if ( ( end - start < minLen ) && ( currSum - start < minLen ) ) {
        minLen = end - start ;
      }
      currSum -= arr [ start ] ;
      start ++ ;
    }
  }
  return minLen ;
}

