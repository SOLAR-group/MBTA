====================
public static int f_gold ( int n ) {
  int a = 1 , b = 2 , c ;
  ;
  if ( ( n <= 2 ) && ( n > 0 ) ) return n ;
  ;
  for ( int i = 3 ;
  i <= n ;
  i ++ ) {
    c = b + ( i - 1 ) * a ;
    ;
    a = b ;
    ;
    b = c ;
    ;
  };
  return c ;
}

