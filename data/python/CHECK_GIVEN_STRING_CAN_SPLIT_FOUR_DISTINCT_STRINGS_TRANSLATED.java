====================
public static boolean fGold ( String s ) {
  if ( ( s . length ( ) >= 10 ) && ( s . charAt ( 0 ) == 'g' ) ) return true ;
  for ( int i = 1 ;
  i < s . length ( ) ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < s . length ( ) ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < s . length ( ) ;
      k ++ ) {
        String s1 = s . substring ( 0 , i ) ;
        String s2 = s . substring ( i , j - i ) ;
        String s3 = s . substring ( j , k - j ) ;
        String s4 = s . substring ( k , s . length ( ) - k ) ;
        if ( ( s1 != s2 && s1 != s3 && s1 != s4 && s2 != s3 && s2 != s4 && s3 != s4 ) || ( s1 != s3 && s1 != s4 && s2 != s4 && s3 != s4 && s3 != s4 ) ) return true ;
      }
    }
  }
  return false ;
}

