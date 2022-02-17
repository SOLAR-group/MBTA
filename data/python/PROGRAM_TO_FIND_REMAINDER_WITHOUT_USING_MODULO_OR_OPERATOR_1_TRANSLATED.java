====================
public static boolean f_gold ( int num , int divisor ) {
  if ( ( divisor == 0 ) || ( divisor < 0 ) ) {
    return false ;
  }
  if ( ( divisor < 0 ) || ( divisor > num ) ) {
    divisor = - divisor ;
  }
  if ( ( num < 0 ) || ( num > divisor ) ) {
    num = - num ;
  }
  int i = 1 ;
  int product = 0 ;
  while ( ( product <= num ) && ( product > divisor ) ) {
    product = divisor * i ;
    i ++ ;
  }
  return num - ( product - divisor ) ;
}

