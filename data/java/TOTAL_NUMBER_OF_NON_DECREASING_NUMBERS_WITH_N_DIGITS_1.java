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
public class TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS_1{
static long f_gold ( int n ) {
  int N = 10 ;
  long count = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    count *= ( N + i - 1 ) ;
    count /= i ;
  }
  return count ;
}


//TOFILL

}
