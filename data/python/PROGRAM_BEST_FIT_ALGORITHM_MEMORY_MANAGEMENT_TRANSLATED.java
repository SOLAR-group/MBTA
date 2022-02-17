====================
public static void f_gold ( int [ ] blockSize , int m , int [ ] processSize , int n ) {
  int [ ] allocation = new int [ n ] ;
  allocation [ 0 ] = - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int bestIdx = - 1 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( blockSize [ j ] >= processSize [ i ] ) {
        if ( bestIdx == - 1 ) bestIdx = j ;
        else if ( blockSize [ bestIdx ] > blockSize [ j ] ) bestIdx = j ;
      }
    }
    if ( bestIdx != - 1 ) {
      allocation [ i ] = bestIdx ;
      blockSize [ bestIdx ] -= processSize [ i ] ;
    }
  }
  System . out . println ( "Process No.Process Size     Block no." ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( i + "         " + processSize [ i ] + "         " ) ;
    if ( allocation [ i ] != - 1 ) System . out . println ( allocation [ i ] + 1 ) ;
    else System . out . println ( "Not Allocated" ) ;
  }
}

