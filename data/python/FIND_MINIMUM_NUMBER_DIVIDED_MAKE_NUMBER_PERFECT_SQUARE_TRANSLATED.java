====================
public static int fGold ( int n ) {
  int count = 0 ;
  int ans = 1 ;
  while ( n % 2 == 0 ) {
    count ++ ;
    n /= 2 ;
  }
  if ( count % 2 != 0 ) ans *= 2 ;
  for ( int i = 3 ;
  i < ( int ) ( Math . sqrt ( n ) ) + 1 ;
  i += 2 ) {
    count = 0 ;
    while ( n % i == 0 ) {
      count ++ ;
      n /= i ;
    }
    if ( count % 2 != 0 ) ans *= i ;
  }
  if ( n > 2 ) ans *= n ;
  return ans ;
}

