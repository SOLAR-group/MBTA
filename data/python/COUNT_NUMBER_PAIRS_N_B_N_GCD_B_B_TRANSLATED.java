====================
public static int f_gold ( int n ) {
  int k = n ;
  int imin = 1 ;
  int ans = 0 ;
  while ( ( imin <= n ) && ( k > 0 ) ) {
    int imax = n / k ;
    ans += k * ( imax - imin + 1 ) ;
    imin = imax + 1 ;
    k = n / imin ;
  }
  return ans ;
}

