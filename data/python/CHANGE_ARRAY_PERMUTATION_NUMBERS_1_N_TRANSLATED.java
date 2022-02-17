====================
public static void f_gold ( int [ ] a , int n ) {
  Map < Integer , Integer > count = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( count . containsKey ( a [ i ] ) ) {
      count . put ( a [ i ] , 1 ) ;
    }
    else {
      count . put ( a [ i ] , 1 ) ;
      ;
    }
  }
  int nextMissing = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( count . get ( a [ i ] ) != 1 || a [ i ] > n || a [ i ] < 1 ) {
      count . put ( a [ i ] , 1 ) ;
      while ( count . containsKey ( nextMissing ) ) {
        nextMissing ++ ;
      }
      a [ i ] = nextMissing ;
      count . put ( nextMissing , 1 ) ;
    }
  }
}

