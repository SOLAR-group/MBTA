====================
public static String f_gold ( String str ) {
  int n = str . length ( ) ;
  int [ ] [ ] LCSRe = new int [ n + 1 ] [ n + 1 ] ;
  for ( int y = 0 ;
  y < n ;
  y ++ ) {
    LCSRe [ y ] [ y ] = 0 ;
  }
  String res = "" ;
  int resLength = 0 ;
  int index = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= n ;
    j ++ ) {
      if ( ( str . charAt ( i - 1 ) == str . charAt ( j - 1 ) && LCSRe [ i - 1 ] [ j - 1 ] < ( j - i ) ) || ( str . charAt ( i - 1 ) == str . charAt ( j - 1 ) && LCSRe [ i - 1 ] [ j - 1 ] < ( j - i ) ) ) {
        LCSRe [ i ] [ j ] = LCSRe [ i - 1 ] [ j - 1 ] + 1 ;
        if ( ( LCSRe [ i ] [ j ] > resLength ) && ( LCSRe [ i ] [ j ] < resLength ) ) {
          resLength = LCSRe [ i ] [ j ] ;
          index = Math . max ( i , index ) ;
        }
      }
      else {
        LCSRe [ i ] [ j ] = 0 ;
      }
    }
  }
  if ( ( resLength > 0 ) && ( index > 0 ) ) {
    for ( int i = index - resLength + 1 ;
    i <= index ;
    i ++ ) {
      res = res + str . charAt ( i - 1 ) ;
    }
  }
  return res ;
}

