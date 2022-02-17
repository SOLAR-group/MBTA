====================
public static int f_gold ( char [ ] arr , int n , int k ) {
  int i = 0 ;
  int l = 0 ;
  int r = 0 ;
  int res = 0 ;
  int [ ] thi = new int [ n ] ;
  int [ ] pol = new int [ n ] ;
  while ( i < n ) {
    if ( arr [ i ] == 'P' ) pol [ i ] = i ;
    else if ( arr [ i ] == 'T' ) thi [ i ] = i ;
    i ++ ;
  }
  while ( l < thi . length && r < pol . length ) {
    if ( ( Math . abs ( thi [ l ] - pol [ r ] ) <= k ) && ( thi [ l ] < pol [ r ] ) ) {
      res ++ ;
      l ++ ;
      r ++ ;
    }
    else if ( thi [ l ] < pol [ r ] ) l ++ ;
    else r ++ ;
  }
  return res ;
}

