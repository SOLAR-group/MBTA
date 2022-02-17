====================
static final void f_gold ( int arr [ ] , int arrSize ) {
  if ( ( arrSize < 3 ) || ( arrSize > 6 ) ) {
    System . out . println ( " Invalid Input " ) ;
    return ;
  }
  int first = arr [ 0 ] ;
  int second = - Integer . MAX_VALUE ;
  int third = - Integer . MAX_VALUE ;
  for ( int i = 1 ;
  i < arrSize ;
  i ++ ) {
    if ( ( arr [ i ] > first ) && ( arr [ i ] < second ) ) {
      third = second ;
      second = first ;
      first = arr [ i ] ;
    }
    else if ( ( arr [ i ] > second ) && ( arr [ i ] < third ) ) {
      third = second ;
      second = arr [ i ] ;
    }
    else if ( ( arr [ i ] > third ) && ( arr [ i ] < first ) ) {
      third = arr [ i ] ;
    }
  }
  System . out . println ( "The third Largest" + "element is" + third ) ;
}

