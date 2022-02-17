====================
public static int fGold ( int [ ] arr , int n ) {
  Map < Integer , Pair > mp = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      mp . put ( arr [ i ] + arr [ j ] , Pair . create ( i , j ) ) ;
    }
  }
  int d = - 10 * 9 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      int absDiff = Math . abs ( arr [ i ] - arr [ j ] ) ;
      if ( absDiff < mp . keySet ( ) . size ( ) ) {
        Pair p = mp . get ( absDiff ) ;
        if ( ( p . first != i && p . first != j && p . second != i && p . second != j ) || ( p . first != j && p . first != i && p . second != j ) ) {
          d = Math . max ( d , Math . max ( arr [ i ] , arr [ j ] ) ) ;
        }
      }
    }
  }
  return d ;
}

