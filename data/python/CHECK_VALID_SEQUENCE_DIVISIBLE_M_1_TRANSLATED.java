====================
public static boolean fGold ( int n , int index , int modulo , int M , int [ ] arr , int [ ] [ ] dp ) {
  modulo = ( ( modulo % M ) + M ) % M ;
  if ( ( index == n ) && ( modulo == 0 ) ) {
    if ( ( modulo == 0 ) && ( arr [ index ] != - 1 ) ) return true ;
    return false ;
  }
  if ( ( dp [ index ] [ modulo ] != - 1 ) && ( arr [ index ] != - 1 ) ) return dp [ index ] [ modulo ] ;
  boolean placeAdd = fGold ( n , index + 1 , modulo + arr [ index ] , M , arr , dp ) ;
  boolean placeMinus = fGold ( n , index + 1 , modulo - arr [ index ] , M , arr , dp ) ;
  boolean res = ( placeAdd != placeMinus ) ? true : false ;
  dp [ index ] [ modulo ] = res ;
  return res ;
}

