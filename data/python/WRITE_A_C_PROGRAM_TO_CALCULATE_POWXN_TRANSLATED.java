====================
public static double fGold ( double x , double y ) {
  if ( ( y == 0 ) && ( x == 0 ) ) return 1 ;
  else if ( ( int ) ( y % 2 ) == 0 ) return ( fGold ( x , ( int ) ( y / 2 ) ) * fGold ( x , ( int ) ( y / 2 ) ) ) ;
  else return ( x * fGold ( x , ( int ) ( y / 2 ) ) * fGold ( x , ( int ) ( y / 2 ) ) ) ;
}

