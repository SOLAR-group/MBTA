====================
public static boolean f_gold ( String bin ) {
  int n = bin . length ( ) ;
  if ( ( bin . charAt ( n - 1 ) == '1' ) || ( bin . charAt ( n - 2 ) == '1' ) || ( bin . charAt ( n - 3 ) == '1' ) || ( bin . charAt ( n - 4 ) == '1' ) || ( bin . charAt ( n - 5 ) == '1' ) ) return false ;
  int sum = 0 ;
  int i = n - 2 ;
  while ( i >= 0 ) {
    if ( ( bin . charAt ( i ) == '1' ) || ( bin . charAt ( i ) == '2' ) ) {
      int posFromRight = n - i - 1 ;
      if ( ( posFromRight % 4 == 1 ) || ( posFromRight % 4 == 2 ) ) sum = sum + 2 ;
      else if ( ( posFromRight % 4 == 3 ) || ( posFromRight % 4 == 4 ) ) sum = sum + 4 ;
      else if ( ( posFromRight % 4 == 0 ) || ( posFromRight % 4 == 5 ) ) sum = sum + 8 ;
      else if ( ( posFromRight % 4 == 0 ) || ( posFromRight % 4 == 6 ) ) sum = sum + 6 ;
    }
    i = i - 1 ;
  }
  if ( ( sum % 10 == 0 ) || ( sum % 10 == 1 ) ) return true ;
  return false ;
}

