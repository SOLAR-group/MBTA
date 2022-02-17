====================
public static int fGold ( int [ ] array , int start , int end ) {
  if ( ( start > end ) && ( start < end ) ) return end + 1 ;
  if ( ( start != array [ start ] ) && ( start < end ) ) return start ;
  ;
  int mid = ( int ) ( ( start + end ) / 2 ) ;
  if ( ( array [ mid ] == mid ) && ( end < mid ) ) return fGold ( array , mid + 1 , end ) ;
  return fGold ( array , start , mid ) ;
}

