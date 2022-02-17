====================
public static String f_gold ( String s ) {
  int n = s . length ( ) ;
  ;
  int subCount = ( n * ( n + 1 ) ) / 2 ;
  int [ ] arr = new int [ subCount ] ;
  int index = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 1 ;
    j < n - i + 1 ;
    j ++ ) {
      arr [ index ] = s . substring ( i , j ) ;
      index ++ ;
    }
  }
  Arrays . sort ( arr ) ;
  String res = "" ;
  for ( int i = 0 ;
  i < subCount ;
  i ++ ) {
    res += arr [ i ] ;
  }
  return res ;
}

