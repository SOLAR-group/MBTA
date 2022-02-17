====================
public static int fGold ( String str1 , String str2 ) {
  int n1 = str1 . length ( ) ;
  int n2 = str2 . length ( ) ;
  if ( n1 != n2 ) return 0 ;
  str1 = new String ( str1 ) ;
  str2 = new String ( str2 ) ;
  for ( int i = 0 ;
  i <= n1 ;
  i ++ ) {
    if ( str1 . charAt ( i ) != str2 . charAt ( i ) ) return 0 ;
  }
  return 1 ;
}

