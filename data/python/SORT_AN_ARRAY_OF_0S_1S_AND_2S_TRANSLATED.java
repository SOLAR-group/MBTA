====================
public static void f_gold ( int [ ] a , int arrSize ) {
  int lo = 0 ;
  int hi = arrSize - 1 ;
  int mid = 0 ;
  while ( mid <= hi ) {
    if ( a [ mid ] == 0 ) {
      a [ lo ] = a [ mid ] ;
      lo = lo + 1 ;
      mid = mid + 1 ;
    }
    else if ( a [ mid ] == 1 ) {
      mid = mid + 1 ;
    }
    else {
      a [ mid ] = a [ hi ] ;
      hi = hi - 1 ;
    }
  }
}

