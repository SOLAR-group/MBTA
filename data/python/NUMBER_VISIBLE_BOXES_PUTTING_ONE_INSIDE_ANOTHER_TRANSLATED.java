====================
public static final int fGold ( int [ ] arr , int n ) {
  Queue < Integer > q = new LinkedList < Integer > ( ) ;
  Arrays . sort ( arr ) ;
  q . add ( arr [ 0 ] ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int now = q . poll ( ) ;
    if ( ( arr [ i ] >= 2 * now ) && ( arr [ i ] <= 2 * now ) ) q . remove ( i ) ;
    q . add ( arr [ i ] ) ;
  }
  return q . size ( ) ;
}

