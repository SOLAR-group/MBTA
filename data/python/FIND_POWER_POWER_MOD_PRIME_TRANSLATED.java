====================
public static double fGold ( double A , double B , double C , int M ) {
  double res = pow ( B , C , M - 1 ) ;
  double ans = pow ( A , res , M ) ;
  return ans ;
}

