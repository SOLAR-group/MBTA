====================
public static Point f_gold ( double a , double b , double c , double x1 , double y1 ) {
  double temp = - 2 * ( a * x1 + b * y1 + c ) / ( a * a + b * b ) ;
  double x = temp * a + x1 ;
  double y = temp * b + y1 ;
  return new Point ( x , y ) ;
}

