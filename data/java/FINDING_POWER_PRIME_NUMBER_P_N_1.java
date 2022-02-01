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
public class FINDING_POWER_PRIME_NUMBER_P_N_1{
static int f_gold ( int n , int p ) {
  int ans = 0 ;
  int temp = p ;
  while ( temp <= n ) {
    ans += n / temp ;
    temp = temp * p ;
  }
  return ans ;
}


//TOFILL

}
