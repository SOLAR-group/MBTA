====================
public static void f_gold ( int [ ] [ ] mat , int row , int column ) {
  System . out . print ( "Diagonal one : " ) ;
  for ( int i = 0 ;
  i <= row ;
  i ++ ) {
    for ( int j = 0 ;
    j <= column ;
    j ++ ) {
      if ( ( i == j ) && ( i != column ) ) {
        System . out . print ( "{}
 " . format ( mat [ i ] [ j ] * mat [ i ] [ j ] ) ) ;
      }
    }
  }
  System . out . print ( " \n\nDiagonal two : " ) ;
  for ( int i = 0 ;
  i <= row ;
  i ++ ) {
    for ( int j = 0 ;
    j <= column ;
    j ++ ) {
      if ( ( i + j == column - 1 ) && ( i != column ) ) {
        System . out . print ( "{}
 " . format ( mat [ i ] [ j ] * mat [ i ] [ j ] ) ) ;
      }
    }
  }
}

