====================
public static int fGold ( int [ ] arr , int n ) {
  Arrays . sort ( arr ) ;
  ;
  int minXor = 999999 ;
  int val ;
  for ( int i = 0 ;
  i <= n - 1 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= n - 1 ;
    j ++ ) {
      val = arr [ i ] ^ arr [ j ] ;
      minXor = Math . min ( minXor , val ) ;
    }
  }
  return minXor ;
}

