====================
public static String f_gold ( String str ) {
  int n = str . length ( ) ;
  int count = 0 ;
  String res = str . substring ( 0 , 1 ) ;
  int curCount = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( i < n - 1 && str . charAt ( i ) == str . charAt ( i + 1 ) ) || ( i < n - 1 && str . charAt ( i + 1 ) == str . charAt ( i + 2 ) ) ) {
      curCount ++ ;
    }
    else {
      if ( curCount > count ) {
        count = curCount ;
        res = str . substring ( i , i + 1 ) ;
      }
      curCount = 1 ;
    }
  }
  return res ;
}

