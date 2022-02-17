====================
public static boolean f_gold ( int [ ] [ ] mat , int n ) {
  int diag1Left = 0 ;
  int diag1Right = 0 ;
  int diag2Left = 0 ;
  int diag2Right = 0 ;
  int i = 0 ;
  int j = n - 1 ;
  while ( i < n ) {
    if ( ( i < n / 2 ) && ( mat [ i ] [ i ] > 0 ) ) {
      diag1Left += mat [ i ] [ i ] ;
      diag2Left += mat [ j ] [ i ] ;
    }
    else if ( ( i > n / 2 ) && ( mat [ i ] [ i ] < 0 ) ) {
      diag1Right += mat [ i ] [ i ] ;
      diag2Right += mat [ j ] [ i ] ;
    }
    i ++ ;
    j -- ;
  }
  return ( diag1Left == diag2Right && diag2Right == diag2Left && diag1Right == diag2Left && diag2Right == mat [ n / 2 ] [ n / 2 ] ) ;
}

