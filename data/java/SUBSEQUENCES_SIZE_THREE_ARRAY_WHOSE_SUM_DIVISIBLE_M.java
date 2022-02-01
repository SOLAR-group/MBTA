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
public class SUBSEQUENCES_SIZE_THREE_ARRAY_WHOSE_SUM_DIVISIBLE_M{
static int f_gold ( int A [ ] , int N , int M ) {
  int sum = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < N ;
      k ++ ) {
        sum = A [ i ] + A [ j ] + A [ k ] ;
        if ( sum % M == 0 ) ans ++ ;
      }
    }
  }
  return ans ;
}


//TOFILL

}
