====================
public static String f_gold ( String num1 , String num2 ) {
  int len1 = num1 . length ( ) ;
  int len2 = num2 . length ( ) ;
  if ( len1 == 0 || len2 == 0 ) return "0" ;
  char [ ] result = new char [ len1 + len2 ] ;
  int i_n1 = 0 ;
  int i_n2 = 0 ;
  for ( int i = len1 - 1 ;
  i >= 0 ;
  i -- ) {
    int carry = 0 ;
    int n1 = ( char ) num1 . charAt ( i ) - 48 ;
    i_n2 = 0 ;
    for ( int j = len2 - 1 ;
    j >= 0 ;
    j -- ) {
      int n2 = ( char ) num2 . charAt ( j ) - 48 ;
      int summ = n1 * n2 + result [ i_n1 + i_n2 ] + carry ;
      carry = summ / 10 ;
      result [ i_n1 + i_n2 ] = summ % 10 ;
      i_n2 ++ ;
    }
    if ( ( carry > 0 ) && ( result [ i_n1 + i_n2 ] == 0 ) ) result [ i_n1 + i_n2 ] += carry ;
    i_n1 ++ ;
  }
  int i = result . length - 1 ;
  while ( ( i >= 0 ) && ( result [ i ] == 0 ) ) i -- ;
  if ( ( i == - 1 ) && ( result [ 0 ] == 0 ) ) return "0" ;
  String s = "" ;
  while ( ( i >= 0 ) && ( result [ i ] == 0 ) ) {
    s += ( char ) ( result [ i ] + 48 ) ;
    i -- ;
  }
  return s ;
}

