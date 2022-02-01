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
public class COUNT_NUMBER_PAIRS_N_B_N_GCD_B_B{
static int f_gold ( int n ) {
  int k = n ;
  int imin = 1 ;
  int ans = 0 ;
  while ( imin <= n ) {
    int imax = n / k ;
    ans += k * ( imax - imin + 1 ) ;
    imin = imax + 1 ;
    k = n / imin ;
  }
  return ans ;
}


//TOFILL

}
