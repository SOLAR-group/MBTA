====================
public static int f_gold ( String str ) {
  for ( int i = 0 ;
  i != str . length ( ) ;
  i ++ ) {
    if ( ( str . charAt ( i ) ) . istitle ( ) ) {
      return str . charAt ( i ) ;
    }
  }
  return 0 ;
}

