====================
public static int f_gold ( int [ ] arr , int N , int k ) {
  int [ ] MS = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) MS [ N - 1 ] = arr [ N - 1 ] ;
  for ( int i = N - 2 ;
  i >= 0 ;
  i -- ) {
    if ( ( i + k + 1 >= N ) && ( MS [ i ] == 0 ) ) MS [ i ] = Math . max ( arr [ i ] , MS [ i + 1 ] ) ;
    else MS [ i ] = Math . max ( arr [ i ] + MS [ i + k + 1 ] , MS [ i + 1 ] ) ;
  }
  return MS [ 0 ] ;
}

