====================
public static boolean f_gold ( String s1 , String s2 ) {
  int n = s1 . length ( ) ;
  int m = s2 . length ( ) ;
  boolean [ ] [ ] dp = ( new boolean [ m + 1 ] [ n + 1 ] ) ;
  dp [ 0 ] [ 0 ] = true ;
  for ( int i = 0 ;
  i < s1 . length ( ) ;
  i ++ ) {
    for ( int j = 0 ;
    j < s2 . length ( ) + 1 ;
    j ++ ) {
      if ( ( dp [ i ] [ j ] ) != null ) {
        if ( ( ( j < s2 . length ( ) ) && ( s1 . charAt ( i ) . toUpperCase ( ) . equals ( s2 . charAt ( j ) ) ) ) ) {
          dp [ i + 1 ] [ j + 1 ] = true ;
        }
        if ( ( s1 . charAt ( i ) . isUpperCase ( ) == false ) && ( s2 . charAt ( j ) . toUpperCase ( ) . equals ( s1 . charAt ( i ) ) ) ) {
          dp [ i + 1 ] [ j ] = true ;
        }
      }
    }
  }
  return ( dp [ n ] [ m ] ) ;
}

