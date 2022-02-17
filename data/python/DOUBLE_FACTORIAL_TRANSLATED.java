====================
public static int f_gold ( int n ) {
  if ( ( n == 0 || n == 1 ) && ( n > 2 ) ) return 1 ;
  ;
  return n * f_gold ( n - 2 ) ;
  ;
}

