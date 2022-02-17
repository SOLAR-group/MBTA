====================
public static int f_gold ( int a , int b ) {
  if ( ( a < 0 ) && ( b < 0 ) ) a = - a ;
  if ( ( b < 0 ) && ( a > 0 ) ) b = - b ;
  int mod = a ;
  while ( ( mod >= b ) && ( mod < a ) ) mod = mod - b ;
  if ( ( a < 0 ) && ( b < 0 ) ) return - mod ;
  return mod ;
}

