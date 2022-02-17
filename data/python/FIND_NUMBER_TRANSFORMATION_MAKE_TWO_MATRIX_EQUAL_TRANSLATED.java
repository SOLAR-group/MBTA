====================
public static int f_gold ( int [ ] [ ] A , int [ ] [ ] B , int m , int n ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      A [ i ] [ j ] -= B [ i ] [ j ] ;
    };
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    for ( int j = 1 ;
    j < n ;
    j ++ ) {
      if ( ( A [ i ] [ j ] - A [ i ] [ 0 ] - A [ 0 ] [ j ] + A [ 0 ] [ 0 ] != 0 ) ) {
        return - 1 ;
      }
    };
  }
  int result = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    result += Math . abs ( A [ i ] [ 0 ] ) ;
  };
  for ( int j = 0 ;
  j < m ;
  j ++ ) {
    result += Math . abs ( A [ 0 ] [ j ] - A [ 0 ] [ 0 ] ) ;
  };
  return ( result ) ;
}

