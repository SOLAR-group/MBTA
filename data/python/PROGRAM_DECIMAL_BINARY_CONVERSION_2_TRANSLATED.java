====================
public static int f_gold ( int N ) {
  int B_Number = 0 ;
  int cnt = 0 ;
  while ( ( N != 0 ) && ( N % 2 == 0 ) ) {
    int rem = N % 2 ;
    int c = Math . pow ( 10 , cnt ) ;
    B_Number += rem * c ;
    N /= 2 ;
    cnt ++ ;
  }
  return B_Number ;
}

