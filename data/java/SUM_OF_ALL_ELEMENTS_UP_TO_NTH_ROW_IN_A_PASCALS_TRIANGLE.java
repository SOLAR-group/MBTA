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
public class SUM_OF_ALL_ELEMENTS_UP_TO_NTH_ROW_IN_A_PASCALS_TRIANGLE{
static long f_gold ( int n ) {
  long sum = 0 ;
  for ( int row = 0 ;
  row < n ;
  row ++ ) {
    sum = sum + ( 1 << row ) ;
  }
  return sum ;
}


//TOFILL

}
