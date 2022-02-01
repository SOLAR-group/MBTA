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
public class COUNT_PAIRS_TWO_SORTED_ARRAYS_WHOSE_SUM_EQUAL_GIVEN_VALUE_X_1{
static int f_gold ( int arr1 [ ] , int arr2 [ ] , int m , int n , int x ) {
  int count = 0 ;
  HashSet < Integer > us = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) us . add ( arr1 [ i ] ) ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) if ( us . contains ( x - arr2 [ j ] ) ) count ++ ;
  return count ;
}


//TOFILL

}
