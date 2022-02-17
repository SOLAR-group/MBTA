====================
public static int f_gold ( int a , int b ) {
  int count = 0 ;
  int p = Math . abs ( a * b ) ;
  if ( ( p == 0 ) || ( p > 10 ) ) return 1 ;
  while ( ( p > 0 ) && ( p < 10 ) ) {
    count = count + 1 ;
    p = p / 10 ;
  }
  return count ;
}

