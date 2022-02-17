====================
public static int fGold ( int [ ] arr , int l , int r , int x ) {
  if ( r >= l ) {
    int mid = l + ( r - l ) / 2 ;
    if ( arr [ mid ] == x ) return mid ;
    else if ( arr [ mid ] > x ) return fGold ( arr , l , mid - 1 , x ) ;
    else return fGold ( arr , mid + 1 , r , x ) ;
  }
  else return - 1 ;
}

