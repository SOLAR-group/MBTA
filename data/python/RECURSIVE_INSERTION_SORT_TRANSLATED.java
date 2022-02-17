====================
public static void fGold ( int [ ] arr , int n ) {
  if ( n <= 1 ) return ;
  fGold ( arr , n - 1 ) ;
  int last = arr [ n - 1 ] ;
  int j = n - 2 ;
  while ( ( j >= 0 ) && ( arr [ j ] > last ) ) {
    arr [ j + 1 ] = arr [ j ] ;
    j = j - 1 ;
  }
  arr [ j + 1 ] = last ;
}

