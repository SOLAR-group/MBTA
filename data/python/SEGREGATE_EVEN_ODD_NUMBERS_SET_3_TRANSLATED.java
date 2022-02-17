====================
public static void f_gold ( int arr [ ] , int n ) {
  int i = - 1 ;
  int j = 0 ;
  while ( ( j != n ) && ( arr [ j ] % 2 == 0 ) ) {
    if ( ( arr [ j ] % 2 == 0 ) && ( arr [ i ] == 0 ) ) {
      i = i + 1 ;
      arr [ i ] = arr [ j ] ;
      arr [ j ] = arr [ i ] ;
    }
    j = j + 1 ;
  }
  for ( i = 0 ;
  i < arr . length ;
  i ++ ) {
    System . out . print ( String . valueOf ( arr [ i ] ) + " " ) ;
  }
}

