====================
public static void f_gold ( int [ ] arr , int k , int n ) {
  for ( int c = 0 ;
  c < k ;
  c ++ ) {
    int maxSoFar = - Integer . MAX_VALUE ;
    int maxHere = 0 ;
    int start = 0 ;
    int end = 0 ;
    int s = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      maxHere += arr [ i ] ;
      if ( ( maxSoFar < maxHere ) && ( maxHere < maxSoFar ) ) {
        maxSoFar = maxHere ;
        start = s ;
        end = i ;
      }
      if ( ( maxHere < 0 ) && ( maxHere < 0 ) ) {
        maxHere = 0 ;
        s = i + 1 ;
      }
    }
    System . out . println ( "Maximum non-overlapping sub-array sum" + c + ": " + maxSoFar + ", starting index: " + start + ", ending index: " + end + "." + " " ) ;
    for ( int l = start ;
    l <= end ;
    l ++ ) {
      arr [ l ] = - Integer . MAX_VALUE ;
    }
  }
  System . out . println ( ) ;
}

