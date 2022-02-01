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
public class MINIMUM_LENGTH_SUBARRAY_SUM_GREATER_GIVEN_VALUE_1{
static int f_gold ( int arr [ ] , int n , int x ) {
  int curr_sum = 0 , min_len = n + 1 ;
  int start = 0 , end = 0 ;
  while ( end < n ) {
    while ( curr_sum <= x && end < n ) {
      if ( curr_sum <= 0 && x > 0 ) {
        start = end ;
        curr_sum = 0 ;
      }
      curr_sum += arr [ end ++ ] ;
    }
    while ( curr_sum > x && start < n ) {
      if ( end - start < min_len ) min_len = end - start ;
      curr_sum -= arr [ start ++ ] ;
    }
  }
  return min_len ;
}


//TOFILL

}
