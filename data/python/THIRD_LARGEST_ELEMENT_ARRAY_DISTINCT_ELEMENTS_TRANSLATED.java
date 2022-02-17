====================
static final void fGold ( int arr [ ] , int arrSize ) {
  if ( ( arrSize < 3 ) || ( arr [ 0 ] > arr [ 1 ] ) || ( arr [ 1 ] > arr [ 2 ] ) ) {
    System . out . println ( " Invalid Input " ) ;
    return ;
  }
  int first = arr [ 0 ] ;
  for ( int i = 1 ;
  i < arrSize ;
  i ++ ) {
    if ( ( arr [ i ] > first ) && ( arr [ i ] < first ) ) {
      first = arr [ i ] ;
    }
  }
  int second = - Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < arrSize ;
  i ++ ) {
    if ( ( arr [ i ] > second && arr [ i ] < first ) && ( arr [ i ] > second ) ) {
      second = arr [ i ] ;
    }
  }
  int third = - Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < arrSize ;
  i ++ ) {
    if ( ( arr [ i ] > third && arr [ i ] < second ) && ( arr [ i ] > third ) && ( arr [ i ] > third ) ) {
      third = arr [ i ] ;
    }
  }
  System . out . println ( "The Third Largest" + "element is" + third ) ;
}

