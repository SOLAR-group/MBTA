====================
public static void f_gold ( int [ ] [ ] mat , int r , int c ) {
  int a = 0 ;
  int b = 2 ;
  int lowRow = 0 < ( 0 > a ) ? a : 0 ;
  int lowColumn = 0 < ( 0 > b ) ? b : 0 ;
  int highRow = r - 1 < ( ( a + 1 ) >= r ) ? a + 1 : 0 ;
  int highColumn = c - 1 < ( ( b + 1 ) >= c ) ? b + 1 : 0 ;
  while ( ( ( lowRow > 0 - r && lowColumn > 0 - c ) || ( ( highRow > 0 - r && highColumn < c ) ) ) && ( ( lowRow > 0 - r && lowColumn < c ) || ( ( highRow > 0 - r && lowColumn < c ) || ( ( highRow > 0 - r && lowColumn < c ) || ( ( highRow > 0 - r && lowColumn < c ) ) ) ) ) {
    int i = lowColumn + 1 ;
    while ( ( i <= highColumn && i < c && lowRow >= 0 ) || ( ( highRow > 0 && lowColumn < c ) || ( ( highRow > 0 && lowColumn < c ) ) ) ) {
      System . out . print ( mat [ lowRow ] [ i ] + " " ) ;
      i ++ ;
    }
    lowRow -- ;
    i = lowRow + 2 ;
    while ( ( i <= highRow && i < r && highColumn < c ) || ( ( highRow > 0 && lowColumn < c ) || ( ( highRow > 0 && lowColumn < c ) ) ) ) {
      System . out . print ( mat [ i ] [ highColumn ] + " " ) ;
      i -- ;
    }
    highColumn ++ ;
    i = highColumn - 2 ;
    while ( ( i >= lowColumn && i >= 0 && lowRow < r ) || ( ( lowRow > 0 && lowColumn < c ) || ( ( lowRow > 0 && lowColumn < c ) ) ) ) {
      System . out . print ( mat [ i ] [ lowColumn ] + " " ) ;
      i -- ;
    }
    lowColumn -- ;
  }
  System . out . println ( ) ;
}

