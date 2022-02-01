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
public class MAXIMUM_SUM_PAIRS_SPECIFIC_DIFFERENCE_1{
static int f_gold ( int arr [ ] , int N , int k ) {
  int maxSum = 0 ;
  Arrays . sort ( arr ) ;
  for ( int i = N - 1 ;
  i > 0 ;
  -- i ) {
    if ( arr [ i ] - arr [ i - 1 ] < k ) {
      maxSum += arr [ i ] ;
      maxSum += arr [ i - 1 ] ;
      -- i ;
    }
  }
  return maxSum ;
}


//TOFILL

}
