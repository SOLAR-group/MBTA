====================
public static int f_gold ( int [ ] arr , int n , int x , int k ) {
  int i = 0 ;
  while ( ( i < n ) && ( arr [ i ] == x ) ) {
    if ( ( arr [ i ] == x ) || ( arr [ i ] == 0 ) ) return i ;
    i = i + Math . max ( 1 , ( int ) ( Math . abs ( arr [ i ] - x ) / k ) ) ;
  }
  System . out . println ( "number is not present!" ) ;
  return - 1 ;
}

