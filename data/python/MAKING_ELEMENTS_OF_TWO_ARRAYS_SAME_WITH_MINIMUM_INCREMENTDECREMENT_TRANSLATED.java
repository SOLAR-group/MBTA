====================
public static int f_gold ( int [ ] a , int [ ] b , int n ) {
  Arrays . sort ( a , 0 , n ) ;
  Arrays . sort ( b , 0 , n ) ;
  int result = 0 ;
  for ( int i = 0 ;
  i < n ;
  i += 1 ) {
    if ( ( a [ i ] > b [ i ] ) && ( a [ i ] < b [ i ] ) ) {
      result = result + Math . abs ( a [ i ] - b [ i ] ) ;
    }
    else if ( ( a [ i ] < b [ i ] ) && ( a [ i ] > b [ i ] ) ) {
      result = result + Math . abs ( a [ i ] - b [ i ] ) ;
    }
  }
  return result ;
}

