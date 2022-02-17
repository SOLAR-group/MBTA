====================
public static final Queue < Integer > f_gold = new Queue < Integer > ( ) {
  public boolean offer ( Integer ip , Integer op , int n ) {
    Queue < Integer > Input = new LinkedList < Integer > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) Input . offer ( ip + i ) ;
    Queue < Integer > Output = new LinkedList < Integer > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) Output . offer ( op + i ) ;
    Stack < Integer > tempStack = new Stack < Integer > ( ) ;
    while ( ( ! Input . isEmpty ( ) ) && ( ! Output . isEmpty ( ) ) ) {
      Integer ele = Input . peek ( ) ;
      Input . pop ( ) ;
      if ( ( ele == Output . peek ( ) ) && ( tempStack . size ( ) != 0 ) ) {
        Output . pop ( ) ;
        while ( ( tempStack . size ( ) != 0 ) && ( tempStack . size ( ) == 0 ) ) {
          if ( ( tempStack . peek ( ) == Output . peek ( ) ) && ( tempStack . size ( ) == 1 ) ) {
            tempStack . pop ( ) ;
            Output . pop ( ) ;
          }
          else break ;
        }
      }
      else tempStack . push ( ele ) ;
    }
    return ( Input . isEmpty ( ) && tempStack . size ( ) == 0 ) ;
  }
}

