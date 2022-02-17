====================
public static int f_gold ( int arr1 [ ] , int arr2 [ ] , int m , int n , int x ) {
  int count = 0 ;
  HashSet < Integer > us = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) us . add ( arr1 [ i ] ) ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) if ( x - arr2 [ j ] == us . size ( ) ) count ++ ;
  return count ;
}

