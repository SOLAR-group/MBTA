====================
static int f_gold ( int [ ] a , int n ) {
  int i , total = 0 ;
  total = 1 ;
  for ( i = 2 ;
  i <= n ;
  i ++ ) {
    total += i ;
    total -= a [ i - 2 ] ;
  }
  return total ;
}

