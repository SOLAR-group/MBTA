====================
public static boolean fGold ( int [ ] A , int arrSize , int sum ) {
  for ( int i = 0 ;
  i <= arrSize - 1 ;
  i ++ ) {
    Set < Integer > s = new HashSet < Integer > ( ) ;
    int currSum = sum - A [ i ] ;
    for ( int j = i + 1 ;
    j < arrSize ;
    j ++ ) {
      if ( ( currSum - A [ j ] ) < s . size ( ) ) {
        System . out . println ( "Triplet is" + A [ i ] + ", " + A [ j ] + ", " + currSum - A [ j ] ) ;
        return true ;
      }
      s . add ( A [ j ] ) ;
    }
  }
  return false ;
}

