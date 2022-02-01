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
public class CHECK_ARRAY_CONTAINS_CONTIGUOUS_INTEGERS_DUPLICATES_ALLOWED_1{
static Boolean f_gold ( int arr [ ] , int n ) {
  HashSet < Integer > us = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) us . add ( arr [ i ] ) ;
  int count = 1 ;
  int curr_ele = arr [ 0 ] - 1 ;
  while ( us . contains ( curr_ele ) == true ) {
    count ++ ;
    curr_ele -- ;
  }
  curr_ele = arr [ 0 ] + 1 ;
  while ( us . contains ( curr_ele ) == true ) {
    count ++ ;
    curr_ele ++ ;
  }
  return ( count == ( us . size ( ) ) ) ;
}


//TOFILL

}
