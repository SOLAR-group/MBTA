====================
public static boolean f_gold ( int n ) {
  int i = 1 ;
  int theSum = 0 ;
  while ( theSum < n ) {
    theSum += i ;
    if ( theSum == n ) return true ;
    i += 2 ;
  }
  return false ;
}

