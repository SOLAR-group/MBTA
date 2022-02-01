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
public class K_TH_DISTINCT_OR_NON_REPEATING_ELEMENT_IN_AN_ARRAY{
static int f_gold ( int arr [ ] , int n , int k ) {
  int dist_count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int j ;
    for ( j = 0 ;
    j < n ;
    j ++ ) if ( i != j && arr [ j ] == arr [ i ] ) break ;
    if ( j == n ) dist_count ++ ;
    if ( dist_count == k ) return arr [ i ] ;
  }
  return - 1 ;
}


//TOFILL

}
