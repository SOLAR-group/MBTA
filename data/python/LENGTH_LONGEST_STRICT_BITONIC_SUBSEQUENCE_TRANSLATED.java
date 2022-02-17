====================
public static int f_gold ( int arr [ ] , int n ) {
  Map < Integer , Integer > inc = Maps . newHashMap ( ) , dcr = Maps . newHashMap ( ) ;
  int lenInc = 0 , lenDcr = 0 ;
  int longLen = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int len = 0 ;
    if ( inc . get ( arr [ i ] - 1 ) . contains ( inc . get ( arr [ i ] - 1 ) ) ) len = inc . get ( arr [ i ] - 1 ) ;
    inc . put ( arr [ i ] , lenInc ++ , len + 1 ) ;
  }
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    int len = 0 ;
    if ( dcr . get ( arr [ i ] - 1 ) . contains ( dcr . get ( arr [ i ] - 1 ) ) ) len = dcr . get ( arr [ i ] - 1 ) ;
    dcr . put ( arr [ i ] , lenDcr ++ , len + 1 ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( longLen < ( lenInc + lenDcr - 1 ) ) longLen = lenInc + lenDcr - 1 ;
  }
  return longLen ;
}

