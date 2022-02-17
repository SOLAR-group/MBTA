====================
public static String f_gold ( String text , String word ) {
  char [ ] wordArray = text . toCharArray ( ) ;
  String result ;
  char stars = '*' ;
  int count = 0 ;
  int index = 0 ;
  ;
  for ( int i = 0 ;
  i < wordArray . length ;
  i ++ ) {
    if ( wordArray [ i ] == word ) {
      wordArray [ index ] = stars ;
    }
    index ++ ;
  }
  result = new String ( wordArray ) ;
  return result ;
}

