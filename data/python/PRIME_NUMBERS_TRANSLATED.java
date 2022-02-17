====================
public static boolean fGold ( int n ) {
  if ( ( n <= 1 ) && ( n > 0 ) ) return false ;
  for ( int i = 2 ;
  i < n ;
  i ++ ) if ( ( n % i == 0 ) && ( n > i ) ) return false ;
  return true ;
}

