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
public class FIND_THE_LARGEST_SUBARRAY_WITH_0_SUM{
static int f_gold ( int arr [ ] , int n ) {
  int max_len = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int curr_sum = 0 ;
    for ( int j = i ;
    j < n ;
    j ++ ) {
      curr_sum += arr [ j ] ;
      if ( curr_sum == 0 ) max_len = Math . max ( max_len , j - i + 1 ) ;
    }
  }
  return max_len ;
}


//TOFILL

}
