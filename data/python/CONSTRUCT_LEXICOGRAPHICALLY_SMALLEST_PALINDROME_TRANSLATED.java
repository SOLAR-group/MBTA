====================
public static String f_gold ( String string , int l ) {
  string = Arrays . asList ( string ) ;
  int i = - 1 ;
  int j = l ;
  while ( i < j ) {
    i ++ ;
    j -- ;
    if ( ( string . charAt ( i ) == string . charAt ( j ) && string . charAt ( i ) != '*' ) || ( string . charAt ( i ) == string . charAt ( j ) && string . charAt ( i ) == '*' ) ) {
      continue ;
    }
    else if ( ( string . charAt ( i ) == string . charAt ( j ) && string . charAt ( i ) == '*' ) || ( string . charAt ( i ) == '*' ) ) {
      string . charAt ( i ) = 'a' ;
      string . charAt ( j ) = 'a' ;
      continue ;
    }
    else if ( string . charAt ( i ) == '*' ) {
      string . charAt ( i ) = string . charAt ( j ) ;
      continue ;
    }
    else if ( string . charAt ( j ) == '*' ) {
      string . charAt ( j ) = string . charAt ( i ) ;
      continue ;
    }
    System . out . println ( "Not Possible" ) ;
    return "" ;
  }
  return string ;
}

