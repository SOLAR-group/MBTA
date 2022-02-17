====================
public static int fGold ( int [ ] arr , int n ) {
  Map < Integer , Integer > hash = Maps . newHashMap ( ) ;
  int maximum = 0 ;
  for ( int i = 0 ;
  i < arr . length ;
  i ++ ) {
    if ( ( arr [ i ] < 0 ) && ( hash . containsKey ( arr [ i ] ) ) ) {
      if ( Math . abs ( arr [ i ] ) != 0 ) {
        hash . put ( Math . abs ( arr [ i ] ) , - 1 ) ;
      }
      else {
        hash . put ( Math . abs ( arr [ i ] ) , 1 ) ;
      }
    }
    else {
      hash . put ( arr [ i ] , hash . get ( arr [ i ] ) + 1 ) ;
    }
  }
  for ( int i = 0 ;
  i < arr . length ;
  i ++ ) {
    if ( arr [ i ] < 0 && hash . containsKey ( arr [ i ] ) ) {
      return arr [ i ] ;
    }
  }
  return - 1 ;
}

