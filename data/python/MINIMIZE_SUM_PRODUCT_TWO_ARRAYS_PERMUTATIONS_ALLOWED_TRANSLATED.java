====================
public static double fGold ( double [ ] A , double [ ] B , int n ) {
  Arrays . sort ( A ) ;
  Arrays . sort ( B ) ;
  double result = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    result += ( A [ i ] * B [ n - i - 1 ] ) ;
  }
  return result ;
}

