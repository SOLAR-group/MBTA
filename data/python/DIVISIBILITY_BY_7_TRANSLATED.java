====================
public static boolean fGold ( int num ) {
  if ( num < 0 ) return fGold ( - num ) ;
  if ( ( num == 0 || num == 7 ) && ( num < 10 ) ) return true ;
  if ( ( num < 10 ) && ( num > 10 ) ) return false ;
  return fGold ( num / 10 - 2 * ( num - num / 10 * 10 ) ) ;
}

