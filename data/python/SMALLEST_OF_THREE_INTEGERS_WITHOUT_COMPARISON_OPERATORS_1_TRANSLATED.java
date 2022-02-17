====================
public static int f_gold ( int x , int y , int z ) {
  if ( ( ! ( y / x ) ) && ( ! ( y / z ) ) ) return y == 0 ? 0 : z ;
  return x == 0 ? 0 : z ;
}

