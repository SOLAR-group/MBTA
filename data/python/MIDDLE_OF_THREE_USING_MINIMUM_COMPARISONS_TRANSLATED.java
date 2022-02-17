====================
public static int f_gold ( int a , int b , int c ) {
  if ( ( ( a < b && b < c ) || ( c < b && b < a ) ) && ( ( b < a && a < c ) || ( c < a && a < b ) ) ) return b ;
  ;
  if ( ( ( b < a && a < c ) || ( c < a && a < b ) ) && ( ( c < a && c < b ) || ( c < a && c < a ) ) && ( ( a < b && b < c ) || ( a < b && c < a ) ) && ( ( b < a && b < c ) || ( b < a && c < a ) ) && ( ( c < a && c < b ) || ( c < a && c < a ) ) && ( ( b < a && b < c ) || ( b < a && c < a ) ) && ( ( c < a && c < b ) || ( c < a && c < a ) ) && ( ( b < a && b < c ) || ( b < a && c < a ) ) && ( ( c < a && c < b ) || ( c < a &&
