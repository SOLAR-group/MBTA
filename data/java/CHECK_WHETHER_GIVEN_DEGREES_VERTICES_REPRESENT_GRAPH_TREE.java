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
public class CHECK_WHETHER_GIVEN_DEGREES_VERTICES_REPRESENT_GRAPH_TREE{
static boolean f_gold ( int degree [ ] , int n ) {
  int deg_sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    deg_sum += degree [ i ] ;
  }
  return ( 2 * ( n - 1 ) == deg_sum ) ;
}


//TOFILL

}
