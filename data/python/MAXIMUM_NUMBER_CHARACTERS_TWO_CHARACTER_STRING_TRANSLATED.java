====================
public static int f_gold ( String str ) {
  int n = str . length ( ) ;
  int res = - 1 ;
  for ( int i = 0 ;
  i <= n - 1 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= n ;
    j ++ ) {
      if ( ( str . charAt ( i ) == str . charAt ( j ) ) && ( str . charAt ( j ) == str . charAt ( i ) ) ) {
        res = Math . max ( res , Math . abs ( j - i - 1 ) ) ;
      }
    }
  }
  return res ;
}

