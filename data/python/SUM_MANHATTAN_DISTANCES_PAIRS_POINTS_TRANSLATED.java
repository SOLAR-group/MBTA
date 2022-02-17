====================
public static int f_gold ( int [ ] x , int [ ] y , int n ) {
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      sum += ( Math . abs ( x [ i ] - x [ j ] ) + Math . abs ( y [ i ] - y [ j ] ) ) ;
    }
  }
  return sum ;
}

