====================
static public void fGold ( int [ ] arr , int n ) {
  for ( int i = n - 1 ;
  i > 0 ;
  i -- ) {
    int j = rand . nextInt ( i + 1 ) ;
    arr [ i ] = arr [ j ] ;
    arr [ j ] = arr [ i ] ;
  }
}

