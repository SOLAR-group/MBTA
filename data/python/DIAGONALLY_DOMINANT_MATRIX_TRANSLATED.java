====================
public static boolean f_gold ( int [ ] [ ] m , int n ) {
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    int sum = 0 ;
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      sum = sum + Math . abs ( m [ i ] [ j ] ) ;
    }
    sum = sum - Math . abs ( m [ i ] [ i ] ) ;
    if ( ( Math . abs ( m [ i ] [ i ] ) < sum ) && ( Math . abs ( m [ i ] [ i ] ) > sum ) ) {
      return false ;
    }
  }
  return true ;
}

