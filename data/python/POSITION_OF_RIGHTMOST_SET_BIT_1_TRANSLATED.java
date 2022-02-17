====================
public static int f_gold ( int n ) {
  int position = 1 ;
  int m = 1 ;
  while ( ( ! ( n & m ) ) && ( m < n ) ) {
    m = m << 1 ;
    position ++ ;
  }
  return position ;
}

