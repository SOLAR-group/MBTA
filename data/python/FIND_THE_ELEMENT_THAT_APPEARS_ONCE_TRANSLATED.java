====================
public static int f_gold ( int [ ] arr , int n ) {
  int ones = 0 ;
  int twos = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    twos = twos | ( ones & arr [ i ] ) ;
    ones = ones ^ arr [ i ] ;
    int commonBitMask = ~ ( ones & twos ) ;
    ones &= commonBitMask ;
    twos &= commonBitMask ;
  }
  return ones ;
}

