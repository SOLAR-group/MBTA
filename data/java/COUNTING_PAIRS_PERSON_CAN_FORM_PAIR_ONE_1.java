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
public class COUNTING_PAIRS_PERSON_CAN_FORM_PAIR_ONE_1{
static int f_gold ( int x ) {
  int dp [ ] = new int [ x + 1 ] ;
  dp [ 0 ] = dp [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= x ;
  i ++ ) dp [ i ] = dp [ i - 1 ] + ( i - 1 ) * dp [ i - 2 ] ;
  return dp [ x ] ;
}


//TOFILL

}