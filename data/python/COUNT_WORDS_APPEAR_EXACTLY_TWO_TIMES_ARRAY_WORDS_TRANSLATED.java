====================
public static int f_gold ( String stri , int n ) {
  Map < String , Integer > m = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    m . put ( stri , m . get ( stri ) + 1 ) ;
  }
  int res = 0 ;
  for ( int i : m . values ( ) ) {
    if ( i == 2 ) {
      res ++ ;
    }
  }
  return res ;
}

