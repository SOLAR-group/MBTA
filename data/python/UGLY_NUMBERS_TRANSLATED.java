====================
public static int f_gold ( int n ) {
  int [ ] ugly = new int [ n ] ;
  ugly [ 0 ] = 1 ;
  int i2 = i3 = i5 = 0 ;
  int nextMultipleOf2 = 2 ;
  int nextMultipleOf3 = 3 ;
  int nextMultipleOf5 = 5 ;
  for ( int l = 1 ;
  l < n ;
  l ++ ) {
    ugly [ l ] = Math . min ( nextMultipleOf2 , nextMultipleOf3 , nextMultipleOf5 ) ;
    if ( ugly [ l ] == nextMultipleOf2 ) {
      i2 ++ ;
      nextMultipleOf2 = ugly [ i2 ] * 2 ;
    }
    if ( ugly [ l ] == nextMultipleOf3 ) {
      i3 ++ ;
      nextMultipleOf3 = ugly [ i3 ] * 3 ;
    }
    if ( ugly [ l ] == nextMultipleOf5 ) {
      i5 ++ ;
      nextMultipleOf5 = ugly [ i5 ] * 5 ;
    }
  }
  return ugly [ n - 1 ] ;
}

