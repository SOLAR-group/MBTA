====================
public static int fGold ( int [ ] arr , int n ) {
  Arrays . sort ( arr ) ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum += arr [ i ] * i ;
  }
  return sum ;
}

