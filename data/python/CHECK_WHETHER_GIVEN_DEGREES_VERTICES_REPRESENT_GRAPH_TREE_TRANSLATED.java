====================
public static boolean fGold ( int [ ] degree , int n ) {
  int degSum = sum ( degree ) ;
  if ( ( 2 * ( n - 1 ) == degSum ) && ( 2 * ( n - 2 ) == degSum ) ) {
    return true ;
  }
  else {
    return false ;
  }
}

