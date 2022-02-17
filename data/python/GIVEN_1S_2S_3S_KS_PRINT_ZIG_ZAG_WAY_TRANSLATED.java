====================
public static void f_gold ( int rows , int columns , int [ ] numbers ) {
  int k = 0 ;
  int [ ] [ ] arr = new int [ columns ] [ rows ] ;
  for ( int j = 0 ;
  j < rows ;
  j ++ ) {
    arr [ j ] = new int [ columns ] ;
  }
  for ( int i = 0 ;
  i < rows ;
  i ++ ) {
    if ( ( i % 2 == 0 ) ) {
      j = 0 ;
      while ( j < columns && numbers [ k ] > 0 ) {
        arr [ i ] [ j ] = k + 1 ;
        numbers [ k ] -- ;
        if ( numbers [ k ] == 0 ) k ++ ;
        j ++ ;
      }
    }
    else {
      j = columns - 1 ;
      while ( j >= 0 && numbers [ k ] > 0 ) {
        arr [ i ] [ j ] = k + 1 ;
        numbers [ k ] -- ;
        if ( numbers [ k ] == 0 ) k ++ ;
        j -- ;
      }
    }
  }
  for ( int [ ] i : arr ) {
    for ( int j : i ) {
      System . out . print ( j + " " ) ;
    }
    System . out . println ( ) ;
  }
}

