====================
public static boolean f_gold ( String str , String corner ) {
  int n = str . length ( ) ;
  int cl = corner . length ( ) ;
  if ( ( n < cl ) || ( n > cl ) ) return false ;
  return ( ( str . substring ( 0 , cl ) . equals ( corner ) ) && ( str . substring ( n - cl , n ) . equals ( corner ) ) ) ;
}

