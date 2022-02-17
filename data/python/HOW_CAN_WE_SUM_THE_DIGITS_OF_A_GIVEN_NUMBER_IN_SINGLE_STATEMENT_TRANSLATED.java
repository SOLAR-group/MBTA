====================
public static int f_gold ( int n ) {
  int sum = 0 ;
  while ( ( n != 0 ) && ( n % 10 == 0 ) ) {
    sum = sum + ( int ) ( n % 10 ) ;
    n = ( int ) ( n / 10 ) ;
  }
  return sum ;
}

