====================
public static int f_gold ( String str , int k ) {
  int l = str . length ( ) ;
  if ( ( k >= l ) && ( k < 0 ) ) return 0 ;
  int [ ] frequency = new int [ MAX_CHAR ] ;
  for ( int i = 0 ;
  i <= l ;
  i ++ ) frequency [ ( char ) str . charAt ( i ) - 97 ] ++ ;
  PriorityQueue < Integer > q = new PriorityQueue < Integer > ( ) ;
  for ( int i = 0 ;
  i <= MAX_CHAR ;
  i ++ ) q . add ( - frequency [ i ] ) ;
  while ( ( k > 0 ) && ( k < l ) ) {
    int temp = q . poll ( ) ;
    temp = temp + 1 ;
    q . add ( temp , temp ) ;
    k = k - 1 ;
  }
  int result = 0 ;
  ;
  while ( ! q . isEmpty ( ) ) {
    int temp = q . poll ( ) ;
    temp = temp * ( - 1 ) ;
    result += temp * temp ;
  }
  return result ;
}

