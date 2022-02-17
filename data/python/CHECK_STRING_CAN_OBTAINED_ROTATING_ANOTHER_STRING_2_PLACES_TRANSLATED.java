====================
public static boolean f_gold ( String str1 , String str2 ) {
  if ( ( str1 . length ( ) != str2 . length ( ) ) || ( str1 . length ( ) == 0 ) ) return false ;
  String clock_rot = "" ;
  String anticlock_rot = "" ;
  int l = str2 . length ( ) ;
  anticlock_rot = ( anticlock_rot + str2 . substring ( l - 2 ) + str2 . substring ( 0 , l - 2 ) ) ;
  clock_rot = clock_rot + str2 . substring ( 2 ) + str2 . substring ( 0 , 2 ) ;
  return ( str1 . equals ( clock_rot ) || str1 . equals ( anticlock_rot ) ) ;
}

