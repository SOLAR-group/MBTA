====================
public static int f_gold ( int [ ] arr , int n ) {
  int sum = 0 ;
  int maxsize = - 1 ;
  for ( int i = 0 ;
  i <= n - 1 ;
  i ++ ) {
    sum = - 1 == ( arr [ i ] == 0 ) ? 1 : 0 ;
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      sum = sum + ( - 1 == ( arr [ j ] == 0 ) ? 0 : 1 ) ;
      if ( ( sum == 0 ) && ( maxsize < j - i + 1 ) ) {
        maxsize = j - i + 1 ;
        startindex = i ;
      }
    }
  }
  if ( ( maxsize == - 1 ) || ( ( maxsize == 0 ) && ( startindex < n ) ) ) {
    System . out . println ( "No such subarray" ) ;
  }
  else {
    System . out . println ( startindex + "to" + startindex + maxsize - 1 ) ;
  }
  return maxsize ;
}

