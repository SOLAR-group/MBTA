====================
public static int fGold ( int [ ] arr , int n ) {
  HashMap < Integer , Integer > mp = new HashMap < Integer , Integer > ( ) ;
  int maxMap = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] != null ) {
      mp . put ( arr [ i ] , i ) ;
    }
    else {
      maxMap = Math . max ( maxMap , i - mp . get ( arr [ i ] ) ) ;
    }
  }
  return maxMap ;
}

