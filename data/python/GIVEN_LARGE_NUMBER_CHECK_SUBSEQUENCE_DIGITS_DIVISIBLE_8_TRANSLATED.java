====================
public static boolean f_gold ( String st ) {
  int l = st . length ( ) ;
  int arr [ ] = new int [ l ] ;
  for ( int i = 0 ;
  i <= l ;
  i ++ ) {
    for ( int j = i ;
    j <= l ;
    j ++ ) {
      for ( int k = j ;
      k <= l ;
      k ++ ) {
        if ( ( arr [ i ] % 8 == 0 ) && ( arr [ j ] % 8 == 0 ) && ( arr [ k ] % 8 == 0 ) ) {
          return true ;
        }
        else if ( ( ( arr [ i ] * 10 + arr [ j ] ) % 8 == 0 && i != j ) && ( i != j ) && ( j != k ) && ( i != k ) ) {
          return true ;
        }
      }
    }
  }
  return false ;
}

