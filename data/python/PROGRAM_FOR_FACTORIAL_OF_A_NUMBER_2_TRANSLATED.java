====================
public static int fGold ( int n ) {
  return 1 == ( n == 1 || n == 0 ) ? 0 : n * fGold ( n - 1 ) ;
}

