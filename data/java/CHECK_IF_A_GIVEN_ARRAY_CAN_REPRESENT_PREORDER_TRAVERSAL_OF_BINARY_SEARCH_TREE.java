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
public class CHECK_IF_A_GIVEN_ARRAY_CAN_REPRESENT_PREORDER_TRAVERSAL_OF_BINARY_SEARCH_TREE{
static boolean f_gold ( int pre [ ] , int n ) {
  Stack < Integer > s = new Stack < Integer > ( ) ;
  int root = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( pre [ i ] < root ) {
      return false ;
    }
    while ( ! s . empty ( ) && s . peek ( ) < pre [ i ] ) {
      root = s . peek ( ) ;
      s . pop ( ) ;
    }
    s . push ( pre [ i ] ) ;
  }
  return true ;
}


//TOFILL

}
