====================
public static void f_gold ( int [ ] arr , int n ) {
  Arrays . sort ( arr ) ;
  int i = 0 ;
  int j = n - 1 ;
  while ( ( i < j ) && ( i < n ) ) {
    System . out . print ( arr [ j ] + " " ) ;
    j -- ;
    System . out . print ( arr [ i ] + " " ) ;
    i ++ ;
  }
  if ( ( n % 2 != 0 ) && ( n % 2 != 1 ) ) System . out . print ( arr [ i ] ) ;
}

