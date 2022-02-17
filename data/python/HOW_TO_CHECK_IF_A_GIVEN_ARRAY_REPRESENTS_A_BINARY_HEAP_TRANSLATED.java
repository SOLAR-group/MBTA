====================
public static boolean fGold ( int [ ] arr , int i , int n ) {
  if ( i > ( int ) ( ( n - 2 ) / 2 ) ) return true ;
  if ( ( arr [ i ] >= arr [ 2 * i + 1 ] && arr [ i ] >= arr [ 2 * i + 2 ] && fGold ( arr , 2 * i + 1 , n ) && fGold ( arr , 2 * i + 2 , n ) ) ) return true ;
  return false ;
}

