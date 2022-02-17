====================
public static boolean f_gold ( int n , int k ) {
  boolean oneSeen = false ;
  while ( ( n > 0 ) && ( n < k ) ) {
    int digit = n % k ;
    if ( ( digit > 1 ) || ( digit == 1 ) ) {
      return false ;
    }
    if ( ( digit == 1 ) && ( oneSeen ) ) {
      return false ;
    }
    oneSeen = true ;
  }
  n /= k ;
  return true ;
}

