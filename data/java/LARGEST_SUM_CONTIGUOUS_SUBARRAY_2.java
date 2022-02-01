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
public class LARGEST_SUM_CONTIGUOUS_SUBARRAY_2{
static int f_gold ( int a [ ] , int size ) {
  int max_so_far = a [ 0 ] ;
  int curr_max = a [ 0 ] ;
  for ( int i = 1 ;
  i < size ;
  i ++ ) {
    curr_max = Math . max ( a [ i ] , curr_max + a [ i ] ) ;
    max_so_far = Math . max ( max_so_far , curr_max ) ;
  }
  return max_so_far ;
}


//TOFILL

}
