====================
public static int fGoldenN ( int n ) {
  if ( n < 3 ) return n ;
  else if ( n >= 3 && n < 10 ) return n - 1 ;
  int po = 1 ;
  while ( n / po > 9 ) po = po * 10 ;
  int msd = n / po ;
  if ( msd != 3 ) return fGoldenN ( msd ) * fGoldenN ( po - 1 ) + fGoldenN ( msd ) + fGoldenN ( n % po ) ;
  else return fGoldenN ( msd * po - 1 ) ;
}

