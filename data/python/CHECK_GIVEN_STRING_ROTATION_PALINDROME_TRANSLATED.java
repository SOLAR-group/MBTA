====================
public static boolean fGold ( String string ) {
  int l = 0 ;
  int h = string . length ( ) - 1 ;
  while ( h > l ) {
    l ++ ;
    h -- ;
    if ( string . charAt ( l - 1 ) != string . charAt ( h + 1 ) ) {
      return false ;
    }
  }
  return true ;
}

