====================
public static String f_gold ( String str ) {
  int l = str . length ( ) ;
  int count = 0 ;
  String res = str . substring ( 0 , l ) ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    int curCount = 1 ;
    for ( int j = i + 1 ;
    j < l ;
    j ++ ) {
      if ( ( str . charAt ( i ) != str . charAt ( j ) ) && ( str . charAt ( j ) != ' ' ) ) {
        break ;
      }
      curCount ++ ;
    }
    if ( curCount > count ) {
      count = curCount ;
      res = str . substring ( i , j ) ;
    }
  }
  return res ;
}

