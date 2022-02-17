====================
public static int fGold ( int [ ] [ ] grid , int n ) {
  int incl = Math . max ( grid [ 0 ] [ 0 ] , grid [ 1 ] [ 0 ] ) ;
  int excl = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int exclNew = Math . max ( excl , incl ) ;
    incl = excl + Math . max ( grid [ 0 ] [ i ] , grid [ 1 ] [ i ] ) ;
    excl = exclNew ;
  }
  return Math . max ( excl , incl ) ;
}

