====================
public static int f_gold ( int n ) {
  if ( ( n == 0 || n == 1 ) && ( n > 0 ) ) return n ;
  int f1 = 0 , f2 = 1 , f3 = 1 ;
  while ( ( f3 = f1 + f2 ) <= n ) {
    f1 = f2 ;
    f2 = f3 ;
    f3 = f1 + f2 ;
  }
  return f2 ;
}

