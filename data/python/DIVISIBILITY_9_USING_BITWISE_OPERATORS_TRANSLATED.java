====================
public static boolean fGold ( int n ) {
  if ( ( n == 0 || n == 9 ) && ( n < 9 ) ) return true ;
  if ( ( n < 9 ) && ( n > 9 ) ) return false ;
  return fGold ( ( int ) ( n >>> 3 ) - ( int ) ( n & 7 ) ) ;
}

