====================
public static boolean fGold ( int [ ] arr , int n ) {
  Set < Integer > s = new HashSet < Integer > ( ) ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum += arr [ i ] ;
  }
  if ( sum % 2 != 0 ) {
    return false ;
  }
  sum = sum / 2 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int val = sum - arr [ i ] ;
    if ( arr [ i ] != 0 ) {
      s . add ( arr [ i ] ) ;
    }
    if ( val < s . size ( ) ) {
      System . out . println ( "Pair elements are" + arr [ i ] + " and" + Integer . toString ( val ) ) ;
    }
  }
  return true ;
}

