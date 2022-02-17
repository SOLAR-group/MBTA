====================
public static int f_gold ( int [ ] a , int n ) {
  Arrays . sort ( a ) ;
  int num1 = 0 , num2 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) num1 = num1 * 10 + a [ i ] ;
    else num2 = num2 * 10 + a [ i ] ;
  }
  return num2 + num1 ;
}

