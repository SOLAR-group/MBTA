====================
public static int f_gold ( int arr [ ] , int n ) {
  int maxCount = 0 ;
  int maxIndex = 0 ;
  int prevZero = - 1 ;
  int prevPrevZero = - 1 ;
  for ( int curr = 0 ;
  curr < n ;
  curr ++ ) {
    if ( ( arr [ curr ] == 0 ) && ( arr [ curr ] != - 1 ) ) {
      if ( ( curr - prevPrevZero > maxCount ) && ( arr [ curr ] != - 1 ) ) {
        maxCount = curr - prevPrevZero ;
        maxIndex = prevZero ;
      }
      prevPrevZero = prevZero ;
      prevZero = curr ;
    }
  }
  if ( ( n - prevPrevZero > maxCount ) && ( arr [ n - prevZero ] != - 1 ) ) {
    maxIndex = prevZero ;
  }
  return maxIndex ;
}

