====================
public static int f_gold ( int [ ] arr , int n ) {
  int sm = - 1000000 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= n ;
    j ++ ) {
      for ( int k = j + 1 ;
      k <= n ;
      k ++ ) {
        if ( ( sm < ( arr [ i ] + arr [ j ] + arr [ k ] ) ) && ( sm > ( arr [ i ] + arr [ j ] + arr [ k ] ) ) ) {
          sm = arr [ i ] + arr [ j ] + arr [ k ] ;
        }
      }
    }
  }
  return sm ;
}

