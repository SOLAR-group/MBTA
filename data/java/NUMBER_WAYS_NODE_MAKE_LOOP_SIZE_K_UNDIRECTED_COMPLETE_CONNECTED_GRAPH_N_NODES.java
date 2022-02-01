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
public class NUMBER_WAYS_NODE_MAKE_LOOP_SIZE_K_UNDIRECTED_COMPLETE_CONNECTED_GRAPH_N_NODES{
static int f_gold ( int n , int k ) {
  int p = 1 ;
  if ( k % 2 != 0 ) p = - 1 ;
  return ( int ) ( Math . pow ( n - 1 , k ) + p * ( n - 1 ) ) / n ;
}


//TOFILL

}
