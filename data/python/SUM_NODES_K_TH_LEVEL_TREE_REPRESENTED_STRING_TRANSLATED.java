====================
public static int f_gold ( String tree , int k ) {
  int level = - 1 ;
  int sum = 0 ;
  int n = tree . length ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( tree . charAt ( i ) == '(' ) && ( tree . charAt ( i + 1 ) == ')' ) ) level ++ ;
    else if ( ( tree . charAt ( i ) == ')' ) && ( tree . charAt ( i + 1 ) == '(' ) ) level -- ;
    else {
      if ( ( level == k ) && ( tree . charAt ( i + 1 ) == '(' ) ) sum += ( Character . digit ( tree . charAt ( i + 1 ) , 16 ) - '0' ) ;
    }
  }
  return sum ;
}

