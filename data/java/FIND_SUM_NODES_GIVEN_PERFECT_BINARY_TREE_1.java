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
public class FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1{
static double f_gold ( int l ) {
  double leafNodeCount = Math . pow ( 2 , l - 1 ) ;
  double sumLastLevel = 0 ;
  sumLastLevel = ( leafNodeCount * ( leafNodeCount + 1 ) ) / 2 ;
  double sum = sumLastLevel * l ;
  return sum ;
}


//TOFILL

}
