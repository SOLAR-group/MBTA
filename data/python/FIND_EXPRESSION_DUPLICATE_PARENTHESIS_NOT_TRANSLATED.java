====================
public static boolean fGold ( String string ) {
  Stack < Character > chars = new Stack < Character > ( ) ;
  for ( char ch : string . toCharArray ( ) ) {
    if ( ch == ')' ) {
      char top = chars . pop ( ) ;
      int elementsInside = 0 ;
      while ( top != '(' ) {
        elementsInside ++ ;
        top = chars . pop ( ) ;
      }
      if ( elementsInside < 1 ) {
        return true ;
      }
    }
    else {
      chars . push ( ch ) ;
    }
  }
  return false ;
}

