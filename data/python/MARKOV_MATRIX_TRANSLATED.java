====================
public static boolean f_gold ( int [ ] [ ] m ) {
  for ( int i = 0 ;
  i != m . length ;
  i ++ ) {
    int sm = 0 ;
    for ( int j = 0 ;
    j != m [ i ] . length ;
    j ++ ) {
      sm = sm + m [ i ] [ j ] ;
    }
    if ( ( sm != 1 ) && ( sm != 0 ) ) return false ;
  }
  return true ;
}

