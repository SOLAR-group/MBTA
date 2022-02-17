====================
public static int f_gold ( int p ) {
  int first = 1 ;
  int second = 1 ;
  int number = 2 ;
  int next = 1 ;
  while ( ( next = ( first + second ) % p ) != 0 ) {
    next = ( first + second ) % p ;
    first = second ;
    second = next ;
    number = number + 1 ;
  }
  return number ;
}

