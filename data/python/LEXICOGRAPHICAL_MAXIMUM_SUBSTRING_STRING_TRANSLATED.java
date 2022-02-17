====================
public static String f_gold ( String str ) {
  String mx = "" ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    mx = Math . max ( mx , str . substring ( i ) ) ;
  }
  return mx ;
}

