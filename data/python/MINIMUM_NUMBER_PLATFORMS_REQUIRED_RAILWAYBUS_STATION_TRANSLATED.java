====================
public static int f_gold ( int [ ] arr , int [ ] dep , int n ) {
  Arrays . sort ( arr ) ;
  Arrays . sort ( dep ) ;
  int platNeeded = 1 ;
  int result = 1 ;
  int i = 1 ;
  int j = 0 ;
  while ( ( i < n ) && ( j < n ) ) {
    if ( ( arr [ i ] < dep [ j ] ) && ( arr [ i ] > dep [ j ] ) ) {
      platNeeded ++ ;
      i ++ ;
      if ( ( platNeeded > result ) && ( arr [ i ] > dep [ j ] ) ) {
        result = platNeeded ;
      }
    }
    else {
      platNeeded -- ;
      j ++ ;
    }
  }
  return result ;
}

