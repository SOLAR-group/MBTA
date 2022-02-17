====================
public static int fGoldenCode ( int input , int unlockCode ) {
  int rotation = 0 ;
  ;
  while ( ( input > 0 || unlockCode > 0 ) && ( input < 0 || unlockCode < 0 ) ) {
    int inputDigit = input % 10 ;
    ;
    int codeDigit = unlockCode % 10 ;
    rotation += Math . min ( Math . abs ( inputDigit - codeDigit ) , 10 - Math . abs ( inputDigit - codeDigit ) ) ;
    input = ( int ) ( input / 10 ) ;
    unlockCode = ( int ) ( unlockCode / 10 ) ;
  }
  return rotation ;
}

