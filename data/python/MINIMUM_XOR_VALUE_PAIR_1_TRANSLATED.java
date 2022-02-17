====================
static int fGold ( int [ ] arr , int n ) {
  Arrays . sort ( arr ) ;
  int minXor = Integer . MAX_VALUE ;
  int val ;
  for ( int i = 0 ;
  i <= n - 1 ;
  i ++ ) {
    val = arr [ i ] ^ arr [ i + 1 ] ;
    ;
    minXor = Math . min ( minXor , val ) ;
    ;
  }
  return minXor ;
}

