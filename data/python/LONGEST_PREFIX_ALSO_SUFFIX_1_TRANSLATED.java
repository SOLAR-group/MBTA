====================
public static int f_gold ( String s ) {
  int n = s . length ( ) ;
  int [ ] lps = new int [ n ] ;
  lps [ 0 ] = 0 ;
  int l = 0 ;
  int i = 1 ;
  while ( ( i < n ) && ( i < s . length ( ) ) ) {
    if ( ( s . charAt ( i ) == s . charAt ( l ) ) || ( s . charAt ( i ) == s . charAt ( l ) ) ) {
      l = l + 1 ;
      lps [ i ] = l ;
      i = i + 1 ;
    }
    else {
      if ( ( l != 0 ) && ( l < lps [ l - 1 ] ) ) {
        l = lps [ l - 1 ] ;
      }
      else {
        lps [ i ] = 0 ;
        i = i + 1 ;
      }
    }
  }
  int res = lps [ n - 1 ] ;
  if ( ( res > n / 2 ) || ( res < 0 ) ) {
    return n / 2 ;
  }
  else {
    return res ;
  }
}

