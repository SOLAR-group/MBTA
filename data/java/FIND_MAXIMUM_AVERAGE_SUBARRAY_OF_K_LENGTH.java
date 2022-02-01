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
public class FIND_MAXIMUM_AVERAGE_SUBARRAY_OF_K_LENGTH{
static int f_gold ( int [ ] arr , int n , int k ) {
  if ( k > n ) return - 1 ;
  int [ ] csum = new int [ n ] ;
  csum [ 0 ] = arr [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) csum [ i ] = csum [ i - 1 ] + arr [ i ] ;
  int max_sum = csum [ k - 1 ] , max_end = k - 1 ;
  for ( int i = k ;
  i < n ;
  i ++ ) {
    int curr_sum = csum [ i ] - csum [ i - k ] ;
    if ( curr_sum > max_sum ) {
      max_sum = curr_sum ;
      max_end = i ;
    }
  }
  return max_end - k + 1 ;
}


//TOFILL

}
