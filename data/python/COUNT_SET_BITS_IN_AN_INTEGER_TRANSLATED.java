====================
public static int f_gold ( int n ) {
  int count = 0 ;
  while ( ( n > 0 ) && ( n & 1 ) != 0 ) {
    count += n & 1 ;
    n >>>= 1 ;
  }
  return count ;
}

