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
public class COUNT_NUMBER_OF_WAYS_TO_COVER_A_DISTANCE_1{
static int f_gold ( int dist ) {
  int [ ] count = new int [ dist + 1 ] ;
  count [ 0 ] = 1 ;
  count [ 1 ] = 1 ;
  count [ 2 ] = 2 ;
  for ( int i = 3 ;
  i <= dist ;
  i ++ ) count [ i ] = count [ i - 1 ] + count [ i - 2 ] + count [ i - 3 ] ;
  return count [ dist ] ;
}


//TOFILL

}
