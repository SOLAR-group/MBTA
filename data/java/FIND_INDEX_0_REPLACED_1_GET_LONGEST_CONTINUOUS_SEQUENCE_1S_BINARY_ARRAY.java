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
public class FIND_INDEX_0_REPLACED_1_GET_LONGEST_CONTINUOUS_SEQUENCE_1S_BINARY_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int max_count = 0 ;
  int max_index = 0 ;
  int prev_zero = - 1 ;
  int prev_prev_zero = - 1 ;
  for ( int curr = 0 ;
  curr < n ;
  ++ curr ) {
    if ( arr [ curr ] == 0 ) {
      if ( curr - prev_prev_zero > max_count ) {
        max_count = curr - prev_prev_zero ;
        max_index = prev_zero ;
      }
      prev_prev_zero = prev_zero ;
      prev_zero = curr ;
    }
  }
  if ( n - prev_prev_zero > max_count ) max_index = prev_zero ;
  return max_index ;
}


//TOFILL

}
