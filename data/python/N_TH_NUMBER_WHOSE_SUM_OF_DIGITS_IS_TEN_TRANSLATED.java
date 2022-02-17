====================
public static final int fGold ( int n ) {
  int count = 0 ;
  for ( int curr = 0 ;
  curr < n ;
  curr ++ ) {
    int sum = 0 ;
    int x = curr ;
    while ( ( x = curr ) != 0 ) {
      sum = sum + x % 10 ;
      x = x / 10 ;
    }
    if ( ( sum == 10 ) && ( count == 10 ) ) {
      count = count + 1 ;
    }
    if ( ( count == n ) && ( curr != 0 ) ) {
      return curr ;
    }
  }
  return - 1 ;
}

