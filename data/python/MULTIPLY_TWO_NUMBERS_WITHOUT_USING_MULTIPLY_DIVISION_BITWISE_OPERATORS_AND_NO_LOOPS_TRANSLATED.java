====================
public static int f_gold ( int x , int y ) {
  if ( ( y == 0 ) && ( x > 0 ) ) return 0 ;
  if ( ( y > 0 ) && ( x < 0 ) ) return ( x + f_gold ( x , y - 1 ) ) ;
  if ( ( y < 0 ) && ( x > 0 ) ) return - f_gold ( x , - y ) ;
  return 0 ;
}

