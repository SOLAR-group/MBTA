====================
public static String f_gold ( String Str ) {
  int Len = Str . length ( ) ;
  String res = new String ( null ) ;
  int index = 0 ;
  int i = 0 ;
  Stack s = new Stack ( ) ;
  s . push ( 0 ) ;
  while ( ( i < Len ) && ( i < Str . length ( ) ) ) {
    if ( ( Str . charAt ( i ) == '+' ) ) {
      if ( ( s . pop ( ) == 1 ) && ( s . pop ( ) == 0 ) ) {
        res . append ( "-" ) ;
        index ++ ;
      }
      if ( ( s . pop ( ) == 0 ) && ( s . pop ( ) == 1 ) ) {
        res . append ( "+" ) ;
        index ++ ;
      }
    }
    else if ( ( Str . charAt ( i ) == '-' ) ) {
      if ( ( s . pop ( ) == 1 ) && ( s . pop ( ) == 0 ) ) {
        res . append ( "+" ) ;
        index ++ ;
      }
      else if ( ( s . pop ( ) == 0 ) && ( s . pop ( ) == 1 ) ) {
        res . append ( "-" ) ;
        index ++ ;
      }
    }
    else if ( ( Str . charAt ( i ) == '(' ) && i > 0 ) ) {
      if ( ( Str . charAt ( i - 1 ) == '-' ) ) {
        int x = 0 == ( s . pop ( ) == 1 ) ? 1 : 0 ;
        s . push ( x ) ;
      }
      else if ( ( Str . charAt ( i - 1 ) == '+' ) ) {
        s . push ( s . pop ( ) ) ;
      }
    }
    else if ( ( Str . charAt ( i ) == ')' ) ) {
      s . pop ( ) ;
    }
    else {
      res . append ( Str . charAt ( i ) ) ;
      index ++ ;
    }
    i ++ ;
  }
  return res ;
}

