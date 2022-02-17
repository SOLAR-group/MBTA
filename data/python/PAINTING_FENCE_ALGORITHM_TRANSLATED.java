====================
public static int f_gold ( int n , int k ) {
  int total = k ;
  int mod = 1000000007 ;
  int same = 0 , diff = k ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    same = diff ;
    diff = total * ( k - 1 ) ;
    diff = diff % mod ;
    total = ( same + diff ) % mod ;
  }
  return total ;
}

