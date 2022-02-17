====================
public static int fGold ( int [ ] arr , int n ) {
  if ( n < 3 ) return - 1 ;
  Arrays . sort ( arr ) ;
  return Math . max ( arr [ 0 ] * arr [ 1 ] * arr [ n - 1 ] , arr [ n - 1 ] * arr [ n - 2 ] * arr [ n - 3 ] ) ;
}

