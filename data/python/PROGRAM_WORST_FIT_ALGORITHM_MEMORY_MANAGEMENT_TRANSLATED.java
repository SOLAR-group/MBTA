====================
public static void f_gold ( int [ ] blockSize , int m , int [ ] processSize , int n ) {
  int [ ] allocation = new int [ n ] ;
  allocation [ 0 ] = - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int wstIdx = - 1 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( blockSize [ j ] >= processSize [ i ] ) {
        if ( wstIdx == - 1 ) {
          wstIdx = j ;
        }
        else if ( blockSize [ wstIdx ] < blockSize [ j ] ) {
          wstIdx = j ;
        }
      }
    }
    if ( wstIdx != - 1 ) {
      allocation [ i ] = wstIdx ;
      blockSize [ wstIdx ] -= processSize [ i ] ;
    }
  }
  System . out . println ( "Process No.Process Size Block no." ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( i + "          " + processSize [ i ] + "     " ) ;
    if ( allocation [ i ] != - 1 ) {
      System . out . println ( allocation [ i ] + 1 ) ;
    }
    else {
      System . out . println ( "Not Allocated" ) ;
    }
  }
}

