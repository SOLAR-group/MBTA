====================
public static int f_gold ( int [ ] a , int n ) {
  Arrays . sort ( a ) ;
  ;
  int [ ] s = new int [ n ] ;
  ;
  int i = 0 ;
  int j = n - 1 ;
  while ( ( i < j ) && ( i < n ) ) {
    s [ i ] = ( a [ i ] + a [ j ] ) ;
    i ++ ;
    j -- ;
  }
  int mini = Math . min ( s ) ;
  int maxi = Math . max ( s ) ;
  return Math . abs ( maxi - mini ) ;
}

