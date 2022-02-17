====================
public static int f_gold ( int [ ] [ ] gold , int m , int n ) {
  int [ ] [ ] goldTable = new int [ n ] [ m ] ;
  for ( int j = 0 ;
  j < m ;
  j ++ ) {
    for ( int col = n - 1 ;
    col >= 0 ;
    col -- ) {
      for ( int row = 0 ;
      row < m ;
      row ++ ) {
        if ( ( col == n - 1 ) || ( col == n - 2 ) ) {
          int right = 0 ;
          if ( goldTable [ row ] [ col + 1 ] != null ) {
            right = goldTable [ row ] [ col + 1 ] ;
          }
          if ( ( row == 0 || col == n - 1 ) || ( row == 0 ) ) {
            int rightUp = 0 ;
            if ( goldTable [ row - 1 ] [ col + 1 ] != null ) {
              rightUp = goldTable [ row - 1 ] [ col + 1 ] ;
            }
            if ( ( row == m - 1 || col == n - 1 ) || ( row == m - 2 ) ) {
              int rightDown = 0 ;
              if ( goldTable [ row + 1 ] [ col + 1 ] != null ) {
                rightDown = goldTable [ row + 1 ] [ col + 1 ] ;
              }
              goldTable [ row ] [ col ] = gold [ row ] [ col ] + Math . max ( right , rightUp , rightDown ) ;
            }
          }
        }
      }
    }
    int res = goldTable [ 0 ] [ 0 ] ;
    for ( int i = 1 ;
    i < m ;
    i ++ ) {
      res = Math . max ( res , goldTable [ i ] [ 0 ] ) ;
    }
    return res ;
  }
  
