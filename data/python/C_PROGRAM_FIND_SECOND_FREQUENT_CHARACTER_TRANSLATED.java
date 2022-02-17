====================
public static char fGoldenString ( String str ) {
  final int NO_OF_CHARS = 256 ;
  int [ ] count = new int [ NO_OF_CHARS ] ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    count [ ( int ) str . charAt ( i ) ] ++ ;
  }
  int first = 0 , second = 0 ;
  for ( int i = 0 ;
  i < NO_OF_CHARS ;
  i ++ ) {
    if ( count [ i ] > count [ first ] ) {
      second = first ;
      first = i ;
    }
    else if ( ( count [ i ] > count [ second ] && count [ i ] != count [ first ] ) || ( count [ i ] > count [ second ] && count [ i ] != count [ first ] ) ) {
      second = i ;
    }
  }
  return ( char ) second ;
}

