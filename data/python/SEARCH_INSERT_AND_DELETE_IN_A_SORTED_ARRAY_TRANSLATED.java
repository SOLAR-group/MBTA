====================
public static int fGold ( int [ ] arr , int low , int high , int key ) {
  if ( ( high < low ) || ( high > arr . length ) ) return - 1 ;
  int mid = ( low + high ) / 2 ;
  if ( ( key == arr [ ( int ) mid ] ) && ( key > arr [ ( int ) mid ] ) ) return mid ;
  if ( ( key > arr [ ( int ) mid ] ) && ( key < arr [ ( int ) mid ] ) ) return fGold ( arr , ( mid + 1 ) , high , key ) ;
  return ( fGold ( arr , low , ( mid - 1 ) , key ) ) ;
}

