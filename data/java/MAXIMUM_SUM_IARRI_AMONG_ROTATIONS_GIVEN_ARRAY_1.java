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
public class MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY_1{
static int f_gold ( int arr [ ] , int n ) {
  int cum_sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) cum_sum += arr [ i ] ;
  int curr_val = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) curr_val += i * arr [ i ] ;
  int res = curr_val ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int next_val = curr_val - ( cum_sum - arr [ i - 1 ] ) + arr [ i - 1 ] * ( n - 1 ) ;
    curr_val = next_val ;
    res = Math . max ( res , next_val ) ;
  }
  return res ;
}


//TOFILL

}
