====================
public static int f_gold ( int s ) {
  int maxvalue = 0 ;
  int i = 1 ;
  for ( i = 0 ;
  i < s - 1 ;
  i ++ ) {
    int j = 1 ;
    for ( j = 0 ;
    j < s ;
    j ++ ) {
      int k = s - i - j ;
      maxvalue = Math . max ( maxvalue , i * j * k ) ;
    }
  }
  return maxvalue ;
}

