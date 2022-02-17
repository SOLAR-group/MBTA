====================
public static int f_gold ( int [ ] arr , int n ) {
  if ( ( n <= 0 ) || ( n > n ) ) return 0 ;
  int incl = arr [ 0 ] ;
  int excl = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int inclNew = arr [ i ] + Math . min ( excl , incl ) ;
    exclNew = incl ;
    incl = inclNew ;
    excl = exclNew ;
  }
  return Math . min ( incl , excl ) ;
}

