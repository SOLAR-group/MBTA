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
public class SMALLEST_SUM_CONTIGUOUS_SUBARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int min_ending_here = 2147483647 ;
  int min_so_far = 2147483647 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( min_ending_here > 0 ) min_ending_here = arr [ i ] ;
    else min_ending_here += arr [ i ] ;
    min_so_far = Math . min ( min_so_far , min_ending_here ) ;
  }
  return min_so_far ;
}


//TOFILL

}
