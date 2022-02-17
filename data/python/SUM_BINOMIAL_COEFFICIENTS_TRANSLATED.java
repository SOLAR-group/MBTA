====================
public static int f_gold ( int n ) {
  int [ ] [ ] C = new int [ n + 2 ] [ n + 2 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j <= Math . min ( i , n ) ;
    j ++ ) {
      if ( ( j == 0 || j == i ) && ( C [ i ] [ j ] == 0 ) ) {
        C [ i ] [ j ] = 1 ;
      }
      else {
        C [ i ] [ j ] = C [ i - 1 ] [ j - 1 ] + C [ i - 1 ] [ j ] ;
      }
    }
  }
  int sum = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    sum += C [ n ] [ i ] ;
  }
  return sum ;
}

