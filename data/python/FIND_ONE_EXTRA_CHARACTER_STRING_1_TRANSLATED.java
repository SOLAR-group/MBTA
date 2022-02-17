====================
public static byte fGold ( String strA , String strB ) {
  int res = 0 ;
  for ( int i = 0 ;
  i < strA . length ( ) ;
  i ++ ) {
    res = res ^ ( ( byte ) strA . charAt ( i ) ) ;
  }
  for ( int i = 0 ;
  i < strB . length ( ) ;
  i ++ ) {
    res = res ^ ( ( byte ) strB . charAt ( i ) ) ;
  }
  return ( ( byte ) res ) ;
  ;
}

