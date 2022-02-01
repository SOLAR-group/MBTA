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
public class MINIMUM_COST_MAKE_ARRAY_SIZE_1_REMOVING_LARGER_PAIRS{
static int f_gold ( int [ ] a , int n ) {
  int min = a [ 0 ] ;
  for ( int i = 1 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] < min ) min = a [ i ] ;
  }
  return ( n - 1 ) * min ;
}


//TOFILL

}
