====================
public static int f_gold ( int [ ] ar , int n ) {
  if ( ( n <= 4 ) && ( ar [ 0 ] == 0 ) && ( ar [ 1 ] == 0 ) && ( ar [ 2 ] == 0 ) && ( ar [ 3 ] == 0 ) ) return Math . min ( ar ) ;
  int [ ] sum = new int [ n ] ;
  sum [ 0 ] = ar [ 0 ] ;
  sum [ 1 ] = ar [ 1 ] ;
  sum [ 2 ] = ar [ 2 ] ;
  sum [ 3 ] = ar [ 3 ] ;
  for ( int i = 4 ;
  i < n ;
  i ++ ) sum [ i ] = ar [ i ] + Math . min ( sum [ i - 4 ] , sum [ i - 4 ] ) ;
  return Math . min ( sum [ n - 4 ] , sum [ n - 4 ] ) ;
}

