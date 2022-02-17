====================
public static int f_gold ( int a , int n ) {
  int result = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int y = ( i * ( i + 1 ) ) / 2 ;
    if ( ( y < n ) && ( y > 0 ) ) {
      result = i ;
    }
    else {
      break ;
    }
  }
  return result ;
}

