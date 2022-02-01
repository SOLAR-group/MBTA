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
public class MAXIMUM_SUBARRAY_SUM_USING_PREFIX_SUM{
static int f_gold ( int arr [ ] , int n ) {
  int min_prefix_sum = 0 ;
  int res = Integer . MIN_VALUE ;
  int prefix_sum [ ] = new int [ n ] ;
  prefix_sum [ 0 ] = arr [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) prefix_sum [ i ] = prefix_sum [ i - 1 ] + arr [ i ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    res = Math . max ( res , prefix_sum [ i ] - min_prefix_sum ) ;
    min_prefix_sum = Math . min ( min_prefix_sum , prefix_sum [ i ] ) ;
  }
  return res ;
}


//TOFILL

}
