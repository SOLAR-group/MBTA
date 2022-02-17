====================
public static int fGold ( int [ ] arr , int low , int high , int x ) {
  if ( ( low > high ) && ( x >= arr [ high ] ) ) return - 1 ;
  if ( ( x >= arr [ high ] ) && ( x < arr [ low ] ) ) return high ;
  int mid = ( int ) ( ( low + high ) / 2 ) ;
  if ( ( arr [ mid ] == x ) && ( arr [ mid - 1 ] <= x && x < arr [ mid ] ) ) return mid - 1 ;
  if ( ( x < arr [ mid ] ) && ( x > arr [ mid ] ) ) return fGold ( arr , low , mid - 1 , x ) ;
  return fGold ( arr , mid + 1 , high , x ) ;
}

