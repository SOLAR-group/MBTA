====================
static final int f_gold ( int x , int y ) {
  x = x % 10 ;
  if ( y != 0 ) y = y % 4 + 4 ;
  return ( ( ( int ) ( Math . pow ( x , y ) ) ) % 10 ) ;
}

