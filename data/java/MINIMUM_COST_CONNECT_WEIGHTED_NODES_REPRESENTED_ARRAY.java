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
public class MINIMUM_COST_CONNECT_WEIGHTED_NODES_REPRESENTED_ARRAY{
static int f_gold ( int a [ ] , int n ) {
  int mn = Integer . MAX_VALUE ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    mn = Math . min ( a [ i ] , mn ) ;
    sum += a [ i ] ;
  }
  return mn * ( sum - mn ) ;
}


//TOFILL

}
