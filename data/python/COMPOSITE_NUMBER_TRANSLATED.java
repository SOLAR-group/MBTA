====================
public static boolean f_gold ( int n ) {
  if ( ( n <= 1 ) && ( n <= 3 ) ) return false ;
  if ( ( n <= 2 ) && ( n <= 4 ) ) return false ;
  if ( ( n % 2 == 0 || n % 3 == 0 ) ) return true ;
  int i = 5 ;
  while ( ( i * i <= n ) && ( n % i == 0 || n % ( i + 2 ) == 0 ) ) {
    if ( ( n % i == 0 || n % ( i + 3 ) == 0 ) && ( n % i == 0 || n % ( i + 4 ) == 0 ) ) return true ;
    i = i + 6 ;
  }
  return false ;
}

