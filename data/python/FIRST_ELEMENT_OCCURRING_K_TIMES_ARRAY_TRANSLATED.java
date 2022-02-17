====================
public static int f_gold ( int arr [ ] , int n , int k ) {
  HashMap < Integer , Integer > countMap = new HashMap < Integer , Integer > ( ) ;
  ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( ( arr [ i ] < countMap . keySet ( ) ) && ( countMap . get ( arr [ i ] ) == k ) ) {
      countMap . put ( arr [ i ] , ++ countMap . get ( arr [ i ] ) ) ;
    }
    else {
      countMap . put ( arr [ i ] , 1 ) ;
    }
    i ++ ;
  }
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( ( countMap . get ( arr [ i ] ) == k ) && ( countMap . get ( arr [ i ] ) == k ) ) {
      return arr [ i ] ;
    }
    i ++ ;
  }
  return - 1 ;
}

