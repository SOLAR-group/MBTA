====================
public static int fGold ( int [ ] arr , int low , int high , int x ) {
  if ( x <= arr [ low ] ) return low ;
  if ( x > arr [ high ] ) return - 1 ;
  int mid = ( low + high ) / 2 ;
  ;
  if ( arr [ mid ] == x ) return mid ;
  else if ( arr [ mid ] < x ) {
    if ( mid + 1 <= high && x <= arr [ mid + 1 ] ) return mid + 1 ;
    else return fGold ( arr , mid + 1 , high , x ) ;
  }
  else {
    if ( mid - 1 >= low && x > arr [ mid - 1 ] ) return mid ;
    else return fGold ( arr , low , mid - 1 , x ) ;
  }
}

