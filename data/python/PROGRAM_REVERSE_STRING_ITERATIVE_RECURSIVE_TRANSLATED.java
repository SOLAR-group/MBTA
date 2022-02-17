====================
public static void f_gold ( String [ ] str ) {
  Stack < Integer > stack = new Stack < Integer > ( ) ;
  for ( int i = 0 ;
  i < str . length ;
  i ++ ) {
    stack . push ( str [ i ] ) ;
  }
  for ( int i = 0 ;
  i < str . length ;
  i ++ ) {
    str [ i ] = stack . pop ( ) ;
  }
}

