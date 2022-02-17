====================
public static void f_gold ( int [ ] arr , int n ) {
  boolean found = false ;
  Arrays . sort ( arr ) ;
  for ( int i = 0 ;
  i <= n - 1 ;
  i ++ ) {
    int l = i + 1 ;
    int r = n - 1 ;
    int x = arr [ i ] ;
    while ( ( l < r ) && ( x + arr [ l ] + arr [ r ] == 0 ) ) {
      if ( ( x + arr [ l ] + arr [ r ] == 0 ) && ( x + arr [ l ] + arr [ r ] < 0 ) ) {
        System . out . println ( x + " " + arr [ l ] + " " + arr [ r ] ) ;
        l ++ ;
        r -- ;
        found = true ;
      }
      else if ( ( x + arr [ l ] + arr [ r ] < 0 ) && ( x + arr [ l ] + arr [ r ] > 0 ) ) l ++ ;
      else r -- ;
    }
  }
  if ( ( found == false ) && ( n > 0 ) ) System . out . println ( " No Triplet Found" ) ;
}

