====================
public static boolean f_gold ( String str ) {
  int n = str . length ( ) - 1 ;
  int i = n ;
  while ( ( i > 0 ) && ( str . charAt ( i - 1 ) <= str . charAt ( i ) ) ) i -- ;
  if ( ( i <= 0 ) && ( str . charAt ( i ) <= str . charAt ( n - 1 ) ) ) return false ;
  int j = i - 1 ;
  while ( ( j + 1 <= n ) && ( str . charAt ( j + 1 ) <= str . charAt ( i - 1 ) ) ) j ++ ;
  str = Arrays . copyOf ( str , str . length ( ) ) ;
  String temp = str . substring ( i - 1 , j ) ;
  str . replace ( i - 1 , str . charAt ( j ) ) ;
  str . replace ( j , temp ) ;
  str = new String ( str ) ;
  str . substring ( 0 , str . length ( ) - 1 ) ;
  return true ;
}

