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
public class COUNT_NUMBER_OF_WAYS_TO_FILL_A_N_X_4_GRID_USING_1_X_4_TILES{
static int f_gold ( int n ) {
  int [ ] dp = new int [ n + 1 ] ;
  dp [ 0 ] = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( i >= 1 && i <= 3 ) dp [ i ] = 1 ;
    else if ( i == 4 ) dp [ i ] = 2 ;
    else {
      dp [ i ] = dp [ i - 1 ] + dp [ i - 4 ] ;
    }
  }
  return dp [ n ] ;
}


//TOFILL

}
