====================
public static int f_gold ( String s ) {
  int n = s . length ( ) ;
  int [ ] auxArr = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    auxArr [ i ] = 0 ;
  }
  if ( ( s . charAt ( 0 ) == '1' ) || ( s . charAt ( 0 ) == '0' ) ) {
    auxArr [ 0 ] = 1 ;
  }
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( ( s . charAt ( i ) == '1' ) || ( s . charAt ( i ) == '0' ) ) {
      auxArr [ i ] = auxArr [ i - 1 ] + 1 ;
    }
    else {
      auxArr [ i ] = auxArr [ i - 1 ] ;
    }
  }
  int count = 0 ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    if ( ( s . charAt ( i ) == '1' ) || ( s . charAt ( i ) == '0' ) ) {
      count += auxArr [ i ] ;
    }
  }
  return count ;
}

