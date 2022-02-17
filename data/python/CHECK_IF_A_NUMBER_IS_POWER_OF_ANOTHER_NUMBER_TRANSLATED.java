====================
public static boolean f_gold ( int x , int y ) {
  if ( ( x == 1 ) && ( y == 1 ) ) return ( y == 1 ) ;
  int pow = 1 ;
  while ( ( pow < y ) || ( pow < x ) ) pow = pow * x ;
  return ( pow == y ) ;
}

