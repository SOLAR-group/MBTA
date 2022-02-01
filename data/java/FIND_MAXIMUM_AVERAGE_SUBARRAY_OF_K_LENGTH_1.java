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
public class FIND_MAXIMUM_AVERAGE_SUBARRAY_OF_K_LENGTH_1{
static int f_gold ( int arr [ ] , int n , int k ) {
  if ( k > n ) return - 1 ;
  int sum = arr [ 0 ] ;
  for ( int i = 1 ;
  i < k ;
  i ++ ) sum += arr [ i ] ;
  int max_sum = sum , max_end = k - 1 ;
  for ( int i = k ;
  i < n ;
  i ++ ) {
    sum = sum + arr [ i ] - arr [ i - k ] ;
    if ( sum > max_sum ) {
      max_sum = sum ;
      max_end = i ;
    }
  }
  return max_end - k + 1 ;
}


//TOFILL

}
