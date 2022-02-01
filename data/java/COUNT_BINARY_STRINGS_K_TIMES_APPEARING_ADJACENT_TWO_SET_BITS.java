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
public class COUNT_BINARY_STRINGS_K_TIMES_APPEARING_ADJACENT_TWO_SET_BITS{
static int f_gold ( int n , int k ) {
  int dp [ ] [ ] [ ] = new int [ n + 1 ] [ k + 1 ] [ 2 ] ;
  dp [ 1 ] [ 0 ] [ 0 ] = 1 ;
  dp [ 1 ] [ 0 ] [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j < i && j < k + 1 ;
    j ++ ) {
      dp [ i ] [ j ] [ 0 ] = dp [ i - 1 ] [ j ] [ 0 ] + dp [ i - 1 ] [ j ] [ 1 ] ;
      dp [ i ] [ j ] [ 1 ] = dp [ i - 1 ] [ j ] [ 0 ] ;
      if ( j - 1 >= 0 ) {
        dp [ i ] [ j ] [ 1 ] += dp [ i - 1 ] [ j - 1 ] [ 1 ] ;
      }
    }
  }
  return dp [ n ] [ k ] [ 0 ] + dp [ n ] [ k ] [ 1 ] ;
}


//TOFILL

}
