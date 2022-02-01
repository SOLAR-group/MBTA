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
public class COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2{
static int f_gold ( int n ) {
  int res = 0 ;
  for ( int x = 0 ;
  x * x < n ;
  x ++ ) for ( int y = 0 ;
  x * x + y * y < n ;
  y ++ ) res ++ ;
  return res ;
}


//TOFILL

}
