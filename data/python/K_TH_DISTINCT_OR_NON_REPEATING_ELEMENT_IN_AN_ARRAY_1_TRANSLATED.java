====================
public static int f_gold ( int arr [ ] , int size , int KthIndex ) {
  HashMap < Integer , Integer > dict = new HashMap < Integer , Integer > ( ) ;
  ArrayList < Integer > vect = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    if ( ( arr [ i ] < dict . size ( ) ) && ( arr [ i ] > 0 ) ) dict . put ( arr [ i ] , dict . get ( arr [ i ] ) + 1 ) ;
    else dict . put ( arr [ i ] , 1 ) ;
  }
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    if ( ( dict . get ( arr [ i ] ) > 1 ) && ( arr [ i ] > 0 ) ) continue ;
    else KthIndex = KthIndex - 1 ;
    if ( ( KthIndex == 0 ) || ( KthIndex == 1 ) ) return arr [ i ] ;
  }
  return - 1 ;
}

