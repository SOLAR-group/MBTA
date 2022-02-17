====================
public static boolean f_gold ( String num ) {
  int length = num . length ( ) ;
  if ( ( length == 1 && num . charAt ( 0 ) == '0' ) || ( length == 2 && num . charAt ( 0 ) == '1' ) ) return true ;
  if ( ( length % 3 == 1 ) || ( length % 3 == 2 ) ) {
    num = String . valueOf ( num ) + "00" ;
    length += 2 ;
  }
  else if ( ( length % 3 == 2 ) || ( length % 3 == 3 ) ) {
    num = String . valueOf ( num ) + "0" ;
    length += 1 ;
  }
  int sum = 0 ;
  int p = 1 ;
  for ( int i = length - 1 ;
  i >= 0 ;
  i -- ) {
    int group = 0 ;
    group += Character . digit ( num . charAt ( i ) , 10 ) - '0' ;
    i -- ;
    group += ( Character . digit ( num . charAt ( i ) , 10 ) - '0' ) * 10 ;
    i -- ;
    group += ( Character . digit ( num . charAt ( i ) , 10 ) - '0' ) * 100 ;
    sum = sum + group * p ;
    p *= ( - 1 ) ;
  }
  sum = Math . abs ( sum ) ;
  return ( sum % 13 == 0 ) ;
}

