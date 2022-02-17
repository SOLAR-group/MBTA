====================
public static int f_gold ( String N ) {
  int length = N . length ( ) ;
  int l = ( int ) ( ( length ) / 2 ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < l + 1 ;
  i ++ ) {
    String s = N . substring ( 0 , 0 + i ) ;
    int l1 = s . length ( ) ;
    String t = N . substring ( i , l1 + i ) ;
    switch ( s . charAt ( 0 ) ) {
      case '0' : case '1' : case '2' : case '3' : case '4' : case '5' : case '6' : case '7' : case '8' : case '9' : case 'a' : case 'b' : case 'c' : case 'd' : case 'e' : case 'f' : case 'g' : case 'h' : case 'i' : case 'j' : case 'k' : case 'l' : case 'm' : case 'n' : case 'o' : case 'p' : case 'q' : case 'r' : case 's' : case 't' : case 'u' : case 'v' : case 'w' : case 'x' : case 'y' : case 'z' : case 'w' : case 'x' : case 'y' : case 'z' : case 'w' : case 'x' : case 'y' : case 'z' : case 'w' : case 'x' : case 'y' : case 'z' : case 'w' : case 'x' : case 'y' : case 'z' : case 'w' : case 'x' : case 'y' : case 'z' : case 'w' : case 'x' : case 'y' :
