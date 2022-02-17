====================
public static int fGold ( int [ ] arr , int n ) {
  Set < Integer > s = new HashSet < Integer > ( ) ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] != 0 ) {
      s . add ( arr [ i ] ) ;
    }
  }
  for ( int i : s ) {
    sum = sum + i ;
  }
  return sum ;
}

