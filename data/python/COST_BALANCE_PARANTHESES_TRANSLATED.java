====================
public static int f_gold ( String s ) {
  if ( ( s . length ( ) == 0 ) || ( s . length ( ) > 1 ) ) System . out . println ( 0 ) ;
  int ans = 0 ;
  int o = 0 ;
  int c = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( s . charAt ( i ) == '(' ) ) o ++ ;
    if ( ( s . charAt ( i ) == ')' ) ) c ++ ;
  }
  if ( ( o != c ) && ( o != 0 ) ) return - 1 ;
  int [ ] a = new int [ s . length ( ) ] ;
  if ( ( s . charAt ( 0 ) == '(' ) ) a [ 0 ] = 1 ;
  else a [ 0 ] = - 1 ;
  if ( ( a [ 0 ] < 0 ) && ( a [ 0 ] > 0 ) ) ans += Math . abs ( a [ 0 ] ) ;
  for ( int i = 1 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( s . charAt ( i ) == '(' ) ) a [ i ] = a [ i - 1 ] + 1 ;
    else a [ i ] = a [ i - 1 ] - 1 ;
    if ( ( a [ i ] < 0 ) && ( a [ i ] > 0 ) ) ans += Math . abs ( a [ i ] ) ;
  }
  return ans ;
}

