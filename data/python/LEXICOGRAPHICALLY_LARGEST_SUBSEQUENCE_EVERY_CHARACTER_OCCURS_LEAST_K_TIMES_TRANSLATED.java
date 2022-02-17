====================
public static void f_gold ( char [ ] s , char [ ] t , int n , int k ) {
  int last = 0 ;
  int cnt ;
  int newLast = 0 ;
  int size = 0 ;
  String string = "zyxwvutsrqponmlkjihgfedcba" ;
  for ( char ch : string . toCharArray ( ) ) {
    cnt = 0 ;
    for ( int i = last ;
    i < n ;
    i ++ ) {
      if ( s [ i ] == ch ) {
        cnt ++ ;
      }
    }
    if ( cnt >= k ) {
      for ( int i = last ;
      i < n ;
      i ++ ) {
        if ( s [ i ] == ch ) {
          t [ size ] = ch ;
          newLast = i ;
          size ++ ;
        }
      }
      last = newLast ;
    }
  }
}

