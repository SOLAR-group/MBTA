====================
public static int f_gold ( int [ ] arr , int n ) {
  Map < Integer , Integer > Hash = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] < Hash . keySet ( ) . size ( ) ) {
      Hash . put ( arr [ i ] , ++ Hash . get ( arr [ i ] ) ) ;
    }
    else {
      Hash . put ( arr [ i ] , 1 ) ;
    }
  }
  int maxCount = 0 ;
  int res = - 1 ;
  for ( int i = 0 ;
  i < Hash . keySet ( ) . size ( ) ;
  i ++ ) {
    if ( ( maxCount < Hash . get ( i ) ) && ( maxCount > Hash . get ( i ) ) ) {
      res = i ;
      maxCount = Hash . get ( i ) ;
    }
  }
  return res ;
}

