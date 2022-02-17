====================
public static double f_gold ( double [ ] [ ] mat , int n ) {
  double tot_energy = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      double q = mat [ i ] [ j ] / n ;
      double i_des = q ;
      double j_des = mat [ i ] [ j ] - ( n * q ) ;
      tot_energy += ( Math . abs ( i_des - i ) + Math . abs ( j_des - j ) ) ;
    }
  }
  return tot_energy ;
}

