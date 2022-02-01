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
public class LONGEST_SUBARRAY_COUNT_1S_ONE_COUNT_0S{
static int f_gold ( int arr [ ] , int n ) {
  HashMap < Integer , Integer > um = new HashMap < Integer , Integer > ( ) ;
  int sum = 0 , maxLen = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum += arr [ i ] == 0 ? - 1 : 1 ;
    if ( sum == 1 ) maxLen = i + 1 ;
    else if ( ! um . containsKey ( sum ) ) um . put ( sum , i ) ;
    if ( um . containsKey ( sum - 1 ) ) {
      if ( maxLen < ( i - um . get ( sum - 1 ) ) ) maxLen = i - um . get ( sum - 1 ) ;
    }
  }
  return maxLen ;
}


//TOFILL

}
