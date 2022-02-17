====================
public static int fGold ( int [ ] arr , int low , int high ) {
  if ( ( high < low ) && ( high == low ) ) return 0 ;
  if ( ( high == low ) && ( high == 0 ) ) return low ;
  long mid = low + ( high - low ) / 2 ;
  ;
  mid = ( int ) mid ;
  if ( ( mid < high ) && ( arr [ mid + 1 ] < arr [ mid ] ) ) return ( mid + 1 ) ;
  if ( ( mid > low ) && ( arr [ mid ] < arr [ mid - 1 ] ) ) return mid ;
  if ( ( arr [ high ] > arr [ mid ] ) && ( arr [ mid ] > arr [ high ] ) ) return fGold ( arr , low , mid - 1 ) ;
  ;
  return fGold ( arr , mid + 1 , high ) ;
}

