====================
public static void f_gold ( int [ ] [ ] ar , int m , int n ) {
  int even = 0 ;
  int odd = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( ( ar [ i ] [ j ] % 2 ) == 0 ) && ( ( ar [ i ] [ j ] % 2 ) == 1 ) ) {
        even ++ ;
      }
      else {
        odd ++ ;
      }
    }
  }
  System . out . println ( " Frequency of odd number =" + odd ) ;
  System . out . println ( " Frequency of even number =" + even ) ;
}

