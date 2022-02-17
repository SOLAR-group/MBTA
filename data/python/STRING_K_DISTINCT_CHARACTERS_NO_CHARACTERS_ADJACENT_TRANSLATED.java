====================
public static String f_gold ( int n , int k ) {
  String res = "" ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    res = res + ( char ) ( 'a' + i ) ;
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < n - k ;
  i ++ ) {
    res = res + ( char ) ( 'a' + count ) ;
    count ++ ;
    if ( ( count == k ) && ( i == n - k ) ) {
      count = 0 ;
    };
  }
  return res ;
}

