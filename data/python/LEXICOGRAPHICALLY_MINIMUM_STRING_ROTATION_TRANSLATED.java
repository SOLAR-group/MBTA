====================
public static int [ ] f_gold ( String str_ ) {
  int n = str_ . length ( ) ;
  int [ ] arr = new int [ n ] ;
  String concat = str_ + str_ ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = concat . charAt ( i ) ;
  }
  Arrays . sort ( arr ) ;
  return arr ;
}

