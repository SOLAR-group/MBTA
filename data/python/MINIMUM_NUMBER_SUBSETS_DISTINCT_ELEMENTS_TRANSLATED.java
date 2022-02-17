====================
public static int fGold ( int [ ] ar , int n ) {
  int res = 0 ;
  Arrays . sort ( ar ) ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    int count = 1 ;
    for ( int j = 0 ;
    j < n - 1 ;
    j ++ ) {
      if ( ar [ i ] == ar [ i + 1 ] ) {
        count ++ ;
      }
      else {
        break ;
      }
    }
    res = Math . max ( res , count ) ;
  }
  return res ;
}

