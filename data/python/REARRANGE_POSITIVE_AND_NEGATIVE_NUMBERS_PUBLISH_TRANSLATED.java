====================
public static void f_gold ( int [ ] arr , int n ) {
  int i = - 1 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    if ( ( arr [ j ] < 0 ) && ( arr [ j ] > 0 ) ) {
      i ++ ;
      arr [ i ] = arr [ j ] ;
      arr [ j ] = arr [ i ] ;
    }
  }
  int pos = i + 1 , neg = 0 ;
  while ( ( pos < n && neg < pos && arr [ neg ] < 0 ) || ( neg < n && arr [ pos ] > 0 ) ) {
    arr [ neg ] = arr [ pos ] ;
    pos ++ ;
    neg += 2 ;
  }
}

