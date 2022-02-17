====================
public static boolean f_gold ( int [ ] A , int arr_size , int sum ) {
  Arrays . sort ( A ) ;
  for ( int i = 0 ;
  i <= arr_size - 2 ;
  i ++ ) {
    int l = i + 1 ;
    int r = arr_size - 1 ;
    while ( ( l < r ) && ( l < A . length ) ) {
      if ( ( A [ i ] + A [ l ] + A [ r ] == sum ) && ( A [ l ] + A [ r ] < sum ) ) {
        System . out . println ( "Triplet is" + A [ i ] + ", " + A [ l ] + ", " + A [ r ] ) ;
        ;
        return true ;
      }
      else if ( ( A [ i ] + A [ l ] + A [ r ] < sum ) && ( A [ l ] + A [ r ] < sum ) ) {
        l ++ ;
      }
      else {
        r -- ;
      }
    }
  }
  return false ;
}

