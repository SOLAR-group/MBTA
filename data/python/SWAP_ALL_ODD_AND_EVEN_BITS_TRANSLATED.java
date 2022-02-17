====================
public static int fGold ( int x ) {
  int evenBits = x & 0xAAAAAAAA ;
  int oddBits = x & 0x55555555 ;
  evenBits >>>= 1 ;
  oddBits <<= 1 ;
  return ( evenBits | oddBits ) ;
}

