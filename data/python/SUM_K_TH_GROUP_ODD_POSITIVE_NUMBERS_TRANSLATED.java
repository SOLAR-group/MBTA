====================
public static int f_gold ( int k ) {
  int cur = ( int ) ( ( k * ( k - 1 ) ) + 1 ) ;
  int sum = 0 ;
  while ( k > 0 ) {
    sum += cur ;
    cur += 2 ;
    k = k - 1 ;
  }
  return sum ;
}

