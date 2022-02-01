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
public class TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS{
static int f_gold ( int n ) {
  int dp [ ] [ ] = new int [ 10 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) dp [ i ] [ 1 ] = 1 ;
  for ( int digit = 0 ;
  digit <= 9 ;
  digit ++ ) {
    for ( int len = 2 ;
    len <= n ;
    len ++ ) {
      for ( int x = 0 ;
      x <= digit ;
      x ++ ) dp [ digit ] [ len ] += dp [ x ] [ len - 1 ] ;
    }
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) count += dp [ i ] [ n ] ;
  return count ;
}


//TOFILL

}
