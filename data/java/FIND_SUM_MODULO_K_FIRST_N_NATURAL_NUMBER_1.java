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
public class FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER_1{
static int f_gold ( int N , int K ) {
  int ans = 0 ;
  int y = N / K ;
  int x = N % K ;
  ans = ( K * ( K - 1 ) / 2 ) * y + ( x * ( x + 1 ) ) / 2 ;
  return ans ;
}


//TOFILL

}
