====================
public static int fGold ( int [ ] arr , int low , int high ) {
  if ( high < low ) return arr [ 0 ] ;
  if ( high == low ) return arr [ low ] ;
  int mid = ( int ) ( ( low + high ) / 2 ) ;
  if ( mid < high && arr [ mid + 1 ] < arr [ mid ] ) return arr [ mid + 1 ] ;
  if ( mid > low && arr [ mid ] < arr [ mid - 1 ] ) return arr [ mid ] ;
  if ( arr [ high ] > arr [ mid ] ) return fGold ( arr , low , mid - 1 ) ;
  return fGold ( arr , mid + 1 , high ) ;
}

