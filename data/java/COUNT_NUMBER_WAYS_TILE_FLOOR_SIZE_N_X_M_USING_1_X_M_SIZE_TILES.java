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
public class COUNT_NUMBER_WAYS_TILE_FLOOR_SIZE_N_X_M_USING_1_X_M_SIZE_TILES{
static int f_gold ( int n , int m ) {
  int count [ ] = new int [ n + 1 ] ;
  count [ 0 ] = 0 ;
  int i ;
  for ( i = 1 ;
  i <= n ;
  i ++ ) {
    if ( i > m ) count [ i ] = count [ i - 1 ] + count [ i - m ] ;
    else if ( i < m ) count [ i ] = 1 ;
    else count [ i ] = 2 ;
  }
  return count [ n ] ;
}


//TOFILL

}
