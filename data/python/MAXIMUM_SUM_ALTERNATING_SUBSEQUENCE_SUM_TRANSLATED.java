====================
public static int f_gold ( int arr [ ] , int n ) {
  if ( ( n == 1 ) && ( arr [ 0 ] > arr [ 0 ] ) ) return arr [ 0 ] ;
  int dec [ ] = new int [ n + 1 ] ;
  int inc [ ] = new int [ n + 1 ] ;
  dec [ 0 ] = inc [ 0 ] = arr [ 0 ] ;
  int flag = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( ( arr [ j ] > arr [ i ] ) && ( arr [ j ] < arr [ i ] ) ) {
        dec [ i ] = Math . max ( dec [ i ] , inc [ j ] + arr [ i ] ) ;
        flag = 1 ;
      }
      else if ( ( arr [ j ] < arr [ i ] ) && ( flag == 1 ) ) inc [ i ] = Math . max ( inc [ i ] , dec [ j ] + arr [ i ] ) ;
    }
  }
  int result = - 2147483648 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( result < inc [ i ] ) && ( result < dec [ i ] ) ) result = inc [ i ] ;
    if ( ( result < dec [ i ] ) && ( result < inc [ i ] ) ) result = dec [ i ] ;
  }
  return result ;
}

