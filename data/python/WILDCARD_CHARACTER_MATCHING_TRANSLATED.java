====================
public static boolean fGold ( String first , String second ) {
  if ( first . length ( ) == 0 && second . length ( ) == 0 ) return true ;
  if ( first . length ( ) > 1 && first . charAt ( 0 ) == '*' && second . length ( ) == 0 ) return false ;
  if ( ( first . length ( ) > 1 && first . charAt ( 0 ) == '?' ) || ( first . length ( ) != 0 && second . length ( ) != 0 && first . charAt ( 0 ) == second . charAt ( 0 ) ) ) return fGold ( first . substring ( 1 ) , second . substring ( 1 ) ) ;
  ;
  if ( first . length ( ) != 0 && first . charAt ( 0 ) == '*' ) return fGold ( first . substring ( 1 ) , second ) || fGold ( first , second . substring ( 1 ) ) ;
  return false ;
}

