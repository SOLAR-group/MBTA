====================
public static boolean f_gold ( long a , long b ) {
  if ( ( a == 0 || b == 0 ) && ( a >= - 9223372036854775807 || a <= - 9223372036854775808 ) ) return false ;
  long result = a * b ;
  if ( ( result >= 9223372036854775807 || result <= - 9223372036854775808 ) && ( a == ( result / b ) ) ) {
    System . out . println ( result / b ) ;
    return false ;
  }
  else return true ;
}

