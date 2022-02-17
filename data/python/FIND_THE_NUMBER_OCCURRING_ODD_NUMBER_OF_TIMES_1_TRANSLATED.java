====================
public static int f_gold ( int arr [ ] , int size ) {
  Map < Integer , Integer > Hash = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    Hash . put ( arr [ i ] , Hash . get ( arr [ i ] ) + 1 ) ;
    ;
  }
  for ( int i = 0 ;
  i < Hash . size ( ) ;
  i ++ ) {
    if ( ( Hash . get ( i ) % 2 != 0 ) && ( Hash . get ( i ) % 2 != 0 ) ) {
      return i ;
    }
  }
  return - 1 ;
}

