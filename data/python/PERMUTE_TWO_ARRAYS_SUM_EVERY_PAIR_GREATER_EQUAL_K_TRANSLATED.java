====================
public static boolean fGold ( int [ ] a , int [ ] b , int n , int k ) {
  Arrays . sort ( a , 0 , n ) ;
  Arrays . sort ( b , 0 , n ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( a [ i ] + b [ i ] ) < k ) {
      return false ;
    }
  }
  return true ;
}

