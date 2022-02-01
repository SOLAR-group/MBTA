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
public class MINIMUM_DIFFERENCE_MAX_MIN_K_SIZE_SUBSETS{
static int f_gold ( int arr [ ] , int N , int K ) {
  Arrays . sort ( arr ) ;
  int res = 2147483647 ;
  for ( int i = 0 ;
  i <= ( N - K ) ;
  i ++ ) {
    int curSeqDiff = arr [ i + K - 1 ] - arr [ i ] ;
    res = Math . min ( res , curSeqDiff ) ;
  }
  return res ;
}


//TOFILL

}
