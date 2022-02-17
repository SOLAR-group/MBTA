====================
public static boolean f_gold ( String string ) {
  int length = string . length ( ) ;
  if ( string . charAt ( 0 ) < 'A' || string . charAt ( 0 ) > 'Z' ) return false ;
  if ( string . charAt ( length - 1 ) != '.' ) return false ;
  int prev_state = 0 ;
  int curr_state = 0 ;
  int index = 1 ;
  while ( ( string . charAt ( index ) ) != '\0' ) {
    if ( string . charAt ( index ) >= 'A' && string . charAt ( index ) <= 'Z' ) curr_state = 0 ;
    else if ( string . charAt ( index ) == ' ' ) curr_state = 1 ;
    else if ( string . charAt ( index ) >= 'a' && string . charAt ( index ) <= 'z' ) curr_state = 2 ;
    else if ( string . charAt ( index ) == '.' ) curr_state = 3 ;
    if ( prev_state == curr_state && curr_state != 2 ) return false ;
    if ( prev_state == 2 && curr_state == 0 ) return false ;
    if ( curr_state == 3 && prev_state != 1 ) return true ;
    index ++ ;
    prev_state = curr_state ;
  }
  return false ;
}

