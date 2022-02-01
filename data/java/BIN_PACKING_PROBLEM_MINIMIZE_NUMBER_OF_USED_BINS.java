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
public class BIN_PACKING_PROBLEM_MINIMIZE_NUMBER_OF_USED_BINS{
static int f_gold ( int weight [ ] , int n , int c ) {
  int res = 0 , bin_rem = c ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( weight [ i ] > bin_rem ) {
      res ++ ;
      bin_rem = c - weight [ i ] ;
    }
    else bin_rem -= weight [ i ] ;
  }
  return res ;
}


//TOFILL

}
