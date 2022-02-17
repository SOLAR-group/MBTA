====================
public static String f_gold ( String str1 , String str2 ) {
  if ( ( str1 . length ( ) > str2 . length ( ) ) && ( str2 . length ( ) > str1 . length ( ) ) ) {
    String t = str1 ;
    str1 = str2 ;
    str2 = t ;
  }
  String str = "" ;
  int n1 = str1 . length ( ) ;
  int n2 = str2 . length ( ) ;
  str1 = str1 . substring ( 0 , str1 . length ( ) - 1 ) ;
  str2 = str2 . substring ( 0 , str2 . length ( ) - 1 ) ;
  int carry = 0 ;
  for ( int i = 0 ;
  i < n1 ;
  i ++ ) {
    int sum = ( ( ( int ) str1 . charAt ( i ) ) - 48 ) + ( ( ( int ) str2 . charAt ( i ) ) - 48 ) + carry ;
    str += ( char ) ( sum % 10 + 48 ) ;
    carry = ( int ) ( sum / 10 ) ;
  }
  for ( int i = n1 ;
  i < n2 ;
  i ++ ) {
    int sum = ( ( ( int ) str2 . charAt ( i ) ) - 48 ) + carry ;
    str += ( char ) ( sum % 10 + 48 ) ;
    carry = ( int ) ( sum / 10 ) ;
  }
  if ( ( carry ) > 0 ) str += ( char ) ( carry + 48 ) ;
  str = str . substring ( 0 , str . length ( ) - 1 ) ;
  return str ;
}

