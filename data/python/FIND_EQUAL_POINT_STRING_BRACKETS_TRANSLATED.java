====================
public static int f_gold ( String str ) {
  int l = str . length ( ) ;
  int [ ] open = new int [ l + 1 ] ;
  int [ ] close = new int [ l + 1 ] ;
  int index = - 1 ;
  open [ 0 ] = 0 ;
  close [ l ] = 0 ;
  if ( ( str . charAt ( 0 ) == '(' ) && ( str . charAt ( 1 ) == ')' ) ) open [ 1 ] = 1 ;
  if ( ( str . charAt ( l - 1 ) == ')' ) && ( str . charAt ( l - 1 ) == '(' ) ) close [ l - 1 ] = 1 ;
  for ( int i = 1 ;
  i < l ;
  i ++ ) {
    if ( ( str . charAt ( i ) == '(' ) && ( str . charAt ( i + 1 ) == ')' ) ) open [ i + 1 ] = open [ i ] + 1 ;
    else open [ i + 1 ] = open [ i ] ;
  }
  for ( int i = l - 2 ;
  i >= 0 ;
  i -- ) {
    if ( ( str . charAt ( i ) == ')' ) && ( str . charAt ( i + 1 ) == ')' ) ) close [ i ] = close [ i + 1 ] + 1 ;
    else close [ i ] = close [ i + 1 ] ;
  }
  if ( ( open [ l ] == 0 ) && ( close [ 0 ] == 0 ) ) return len ;
  for ( int i = 0 ;
  i < l + 1 ;
  i ++ ) {
    if ( ( open [ i ] == close [ i ] ) && ( open [ i + 1 ] == 0 ) ) index = i ;
  }
  return index ;
}

