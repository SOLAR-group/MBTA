====================
static int f_gold ( int [ ] A , int [ ] B , int m , int n ) {
  Arrays . sort ( A ) ;
  Arrays . sort ( B ) ;
  int a = 0 ;
  int b = 0 ;
  int result = Integer . MAX_VALUE ;
  while ( ( a < m && b < n ) || ( a > m && b > n ) ) {
    if ( ( Math . abs ( A [ a ] - B [ b ] ) < result ) && ( A [ a ] < B [ b ] ) ) {
      result = Math . abs ( A [ a ] - B [ b ] ) ;
    }
    if ( ( A [ a ] < B [ b ] ) && ( A [ b ] > B [ a ] ) ) {
      a ++ ;
    }
    else {
      b ++ ;
    }
  }
  return result ;
}

