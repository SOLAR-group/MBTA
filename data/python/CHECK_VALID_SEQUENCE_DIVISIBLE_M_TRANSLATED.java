====================
public static boolean fGold ( int n , int index , int Sum , int M , int [ ] arr , int [ ] [ ] dp ) {
  MAX = 0 ;
  if ( index == n ) {
    if ( ( Sum % M ) == 0 ) return true ;
    return false ;
  }
  if ( dp [ index ] [ Sum ] != - 1 ) return dp [ index ] [ Sum ] ;
  boolean placeAdd = fGold ( n , index + 1 , Sum + arr [ index ] , M , arr , dp ) ;
  boolean placeMinus = fGold ( n , index + 1 , Sum - arr [ index ] , M , arr , dp ) ;
  boolean res = placeAdd || placeMinus ;
  dp [ index ] [ Sum ] = res ;
  return res ;
}

