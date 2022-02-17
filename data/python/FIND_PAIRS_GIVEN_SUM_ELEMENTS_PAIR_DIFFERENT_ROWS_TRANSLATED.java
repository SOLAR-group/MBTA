====================
public static void f_gold ( int [ ] [ ] mat , int n , int sum ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    mat [ i ] . sort ( ) ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      int left = 0 ;
      int right = n - 1 ;
      while ( ( left < n && right >= 0 ) || ( j < n && left >= 0 ) ) {
        if ( ( ( mat [ i ] [ left ] + mat [ j ] [ right ] ) == sum ) && ( ( mat [ i ] [ left ] + mat [ j ] [ right ] ) < sum ) ) {
          System . out . print ( "(" + mat [ i ] [ left ] + ", " + mat [ j ] [ right ] + "), " ) ;
          left ++ ;
          right -- ;
        }
        else {
          if ( ( ( mat [ i ] [ left ] + mat [ j ] [ right ] ) < sum ) && ( ( mat [ i ] [ left ] + mat [ j ] [ right ] ) < sum ) ) {
            left ++ ;
          }
          else {
            right -- ;
          }
        }
      }
    }
  }
}

