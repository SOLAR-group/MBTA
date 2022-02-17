====================
public static int f_gold ( int x ) {
  int next = 0 ;
  if ( ( x > 0 ) && ( x < ( x + 1 ) ) ) {
    int rightOne = x & - ( x ) ;
    int nextHigherOneBit = x + Integer . MIN_VALUE ;
    int rightOnesPattern = x ^ Integer . MIN_VALUE ;
    rightOnesPattern = ( Integer . bitCount ( rightOnesPattern ) / Integer . MIN_VALUE ) ;
    rightOnesPattern = Integer . bitCount ( rightOnesPattern ) >> 2 ;
    next = nextHigherOneBit | rightOnesPattern ;
  }
  return next ;
}

