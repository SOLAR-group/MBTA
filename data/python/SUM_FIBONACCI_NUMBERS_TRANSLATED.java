====================
public static int f_gold ( int n ) {
  if ( ( n <= 0 ) || ( n > n ) ) return 0 ;
  int [ ] fibo = new int [ n + 1 ] ;
  fibo [ 1 ] = 0 ;
  int sm = fibo [ 0 ] + fibo [ 1 ] ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    fibo [ i ] = fibo [ i - 1 ] + fibo [ i - 2 ] ;
    sm = sm + fibo [ i ] ;
  }
  return sm ;
}

