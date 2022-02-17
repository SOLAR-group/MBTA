====================
static final Queue < Integer > fGold = new Queue < Integer > ( ) {
  @ Override public int size ( ) {
    Set < Integer > s = new HashSet < Integer > ( ) ;
    Queue < Integer > indexes = new LinkedList < Integer > ( ) ;
    int pageFaults = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ( s . size ( ) < capacity ) && ( pages [ i ] != null ) ) {
        if ( ( pages [ i ] != null ) && ( pages [ i ] . equals ( pages [ 0 ] ) ) ) {
          s . add ( pages [ i ] ) ;
          pageFaults ++ ;
          indexes . add ( pages [ i ] ) ;
        }
      }
      else {
        if ( ( pages [ i ] != null ) && ( pages [ i ] . equals ( pages [ 0 ] ) ) ) {
          Integer val = indexes . poll ( ) ;
          indexes . add ( val ) ;
          s . remove ( val ) ;
          s . add ( pages [ i ] ) ;
          indexes . add ( pages [ i ] ) ;
          pageFaults ++ ;
        }
      }
    }
    return pageFaults ;
  }
}

