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
public class COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2_1{
static int f_gold ( int n ) {
  int x = 0 , yCount , res = 0 ;
  for ( yCount = 0 ;
  yCount * yCount < n ;
  yCount ++ ) ;
  while ( yCount != 0 ) {
    res += yCount ;
    x ++ ;
    while ( yCount != 0 && ( x * x + ( yCount - 1 ) * ( yCount - 1 ) >= n ) ) yCount -- ;
  }
  return res ;
}


//TOFILL

}
