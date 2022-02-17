====================
public static int f_gold ( int n ) {
  int p = 1 ;
  if ( ( n > 0 ) && ! ( n & ( n - 1 ) ) ) return n ;
  while ( ( p < n ) && ( p < ( n - 1 ) ) ) p <<= 1 ;
  return p ;
  ;
}

