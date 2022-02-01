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
public class MAXIMUM_REMOVAL_FROM_ARRAY_WHEN_REMOVAL_TIME_WAITING_TIME{
static int f_gold ( int arr [ ] , int n ) {
  int count = 0 ;
  int cummulative_sum = 0 ;
  Arrays . sort ( arr ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] >= cummulative_sum ) {
      count ++ ;
      cummulative_sum += arr [ i ] ;
    }
  }
  return count ;
}


//TOFILL

}
