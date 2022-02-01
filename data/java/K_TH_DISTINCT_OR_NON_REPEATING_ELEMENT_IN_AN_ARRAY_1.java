import java.io.FileWriter;
import java.io.IOException;
// Copyright (c) 2019-present, Facebook, Inc.
// All rights reserved.
//
// This source code is licensed under the license found in the
// LICENSE file in the root directory of this source tree.
//

import java.util. *;
import java.util.stream.*;
import java.lang.*;
import javafx.util.Pair;
public class K_TH_DISTINCT_OR_NON_REPEATING_ELEMENT_IN_AN_ARRAY_1{
static int f_gold ( int arr [ ] , int n , int k ) {
  Map < Integer , Integer > h = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( h . containsKey ( arr [ i ] ) ) h . put ( arr [ i ] , h . get ( arr [ i ] ) + 1 ) ;
    else h . put ( arr [ i ] , 1 ) ;
  }
  if ( h . size ( ) < k ) return - 1 ;
  int dist_count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( h . get ( arr [ i ] ) == 1 ) dist_count ++ ;
    if ( dist_count == k ) return arr [ i ] ;
  }
  return - 1 ;
}


//TOFILL

}
