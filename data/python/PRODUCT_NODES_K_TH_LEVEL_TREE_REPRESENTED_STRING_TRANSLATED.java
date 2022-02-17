====================
public static int fGold ( String tree , int k ) {
  int level = - 1 ;
  int product = 1 ;
  int n = tree . length ( ) ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( ( tree . charAt ( i ) == '(' ) && ( tree . charAt ( i + 1 ) == ')' ) ) level ++ ;
    else if ( ( tree . charAt ( i ) == ')' ) && ( tree . charAt ( i + 1 ) == '(' ) ) level -- ;
    else {
      if ( ( level == k ) && ( tree . charAt ( i + 1 ) == '(' ) ) product *= ( Integer . parseInt ( tree . substring ( i + 1 ) ) - Integer . parseInt ( "0" ) ) ;
    }
  }
  return product ;
}

