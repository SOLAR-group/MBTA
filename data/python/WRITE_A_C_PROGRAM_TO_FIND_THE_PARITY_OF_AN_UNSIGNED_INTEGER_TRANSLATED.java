====================
public static int f_gold ( int n ) {
  int parity = 0 ;
  while ( n > 0 ) {
    parity = ~ parity ;
    n = n & ( n - 1 ) ;
  }
  return parity ;
}

