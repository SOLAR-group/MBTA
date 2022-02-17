====================
public static int f_gold ( String number ) {
  int n = number . length ( ) ;
  int [ ] d = new int [ 9 ] ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) d [ i ] = 0 ;
  d [ 0 ] = 1 ;
  int result = 0 ;
  int modSum = 0 ;
  int continuousZero = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( Character . digit ( number . charAt ( i ) , 10 ) - '0' ) == 0 ) continuousZero ++ ;
    else continuousZero = 0 ;
    modSum += Character . digit ( number . charAt ( i ) , 10 ) - '0' ;
    modSum %= 9 ;
    result += d [ modSum ] ;
    d [ modSum ] ++ ;
    result -= continuousZero ;
  }
  return result ;
}

