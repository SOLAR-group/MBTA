====================
public static void fGold ( String s1 , String s2 , int index ) {
  s2 . charAt ( index ) = s1 . charAt ( index ) ;
  ;
  if ( ( index == s1 . length ( ) - 1 ) && ( index < s2 . length ( ) ) ) return ;
  ;
  fGold ( s1 , s2 , index + 1 ) ;
  ;
}

