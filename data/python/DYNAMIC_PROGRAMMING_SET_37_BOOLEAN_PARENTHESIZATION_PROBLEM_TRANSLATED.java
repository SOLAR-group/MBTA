====================
public static int f_gold ( char symb , char oper , int n ) {
  int [ ] [ ] F = new int [ n + 1 ] [ n + 1 ] ;
  int [ ] [ ] T = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( symb == 'F' ) F [ i ] [ i ] = 1 ;
    else F [ i ] [ i ] = 0 ;
    if ( symb == 'T' ) T [ i ] [ i ] = 1 ;
    else T [ i ] [ i ] = 0 ;
  }
  for ( int gap = 1 ;
  gap < n ;
  gap ++ ) {
    int i = 0 ;
    for ( int j = gap ;
    j < n ;
    j ++ ) {
      T [ i ] [ j ] = F [ i ] [ j ] = 0 ;
      for ( int g = 0 ;
      g < gap ;
      g ++ ) {
        int k = i + g ;
        int tik = T [ i ] [ k ] + F [ i ] [ k ] ;
        ;
        int tkj = T [ k + 1 ] [ j ] + F [ k + 1 ] [ j ] ;
        ;
        if ( oper == '&' ) {
          T [ i ] [ j ] += T [ i ] [ k ] * T [ k + 1 ] [ j ] ;
          F [ i ] [ j ] += ( tik * tkj - T [ i ] [ k ] * T [ k + 1 ] [ j ] ) ;
        }
        if ( oper == '|' ) {
          F [ i ] [ j ] += F [ i ] [ k ] * F [ k + 1 ] [ j ] ;
          T [ i ] [ j ] += ( tik * tkj - F [ i ] [ k ] * F [ k + 1 ] [ j ] ) ;
        }
        if ( oper == '^' ) {
          T [ i ] [ j ] += ( F [ i ] [ k ] * T [ k + 1 ] [ j ] + T [ i ] [ k ] * F [ k + 1 ] [ j ] ) ;
          F [ i ] [ j ] += ( T [ i ] [ k ] * T [ k + 1 ] [ j ] + F [ i ] [ k + 1 ] [ j ] ) ;
        }
      }
    }
  }
  return 0 ;
}

