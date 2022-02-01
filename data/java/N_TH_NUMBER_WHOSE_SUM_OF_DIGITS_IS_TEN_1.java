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
public class N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_1{
public static int f_gold ( int n ) {
  int count = 0 ;
  for ( int curr = 19 ;
  ;
  curr += 9 ) {
    int sum = 0 ;
    for ( int x = curr ;
    x > 0 ;
    x = x / 10 ) sum = sum + x % 10 ;
    if ( sum == 10 ) count ++ ;
    if ( count == n ) return curr ;
  }
}


//TOFILL

}
