====================
public static int f_gold ( String S ) {
  ArrayList < Integer > arr = new ArrayList < Integer > ( ) ;
  arr . add ( new Integer ( '@' ) ) ;
  int maxlen = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    arr . add ( new Integer ( S . charAt ( i ) ) ) ;
    while ( ( arr . size ( ) >= 3 && arr . get ( arr . size ( ) - 3 ) . charAt ( 0 ) == '1' && arr . get ( arr . size ( ) - 2 ) . charAt ( 0 ) == '0' && arr . get ( arr . size ( ) - 1 ) . charAt ( 0 ) == '0' ) ) {
      arr . remove ( arr . size ( ) - 1 ) ;
      arr . remove ( arr . size ( ) - 2 ) ;
      arr . remove ( arr . size ( ) - 1 ) ;
    }
    Integer tmp = arr . get ( arr . size ( ) - 1 ) ;
    maxlen = Math . max ( maxlen , i - tmp . intValue ( ) ) ;
  }
  return maxlen ;
}

