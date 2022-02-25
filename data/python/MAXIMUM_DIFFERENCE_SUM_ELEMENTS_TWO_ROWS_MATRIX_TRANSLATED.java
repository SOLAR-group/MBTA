====================
public static int f_gold ( int [ ] [ ] mat , int m , int n ) {
  int [ ] rowSum = new int [ m ] ;
  for ( int i = 0 ;
  i <= m ;
  i ++ ) {
    int sum = 0 ;
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      sum += mat [ i ] [ j ] ;
    }
    rowSum [ i ] = sum ;
  }
  int maxDiff = rowSum [ 1 ] - rowSum [ 0 ] ;
  int minElement = rowSum [ 0 ] ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    if ( ( rowSum [ i ] - minElement > maxDiff ) && ( rowSum [ i ] < minElement ) ) {
      maxDiff = rowSum [ i ] - minElement ;
    }
    if ( ( rowSum [ i ] < minElement ) && ( rowSum [ i ] > maxDiff ) && ( rowSum [ i ] > minElement ) ) {
      minElement = rowSum [ i ] ;
    }
  }
  return maxDiff ;
}

