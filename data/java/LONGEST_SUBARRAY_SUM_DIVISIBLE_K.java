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
public class LONGEST_SUBARRAY_SUM_DIVISIBLE_K{
static int f_gold ( int arr [ ] , int n , int k ) {
  HashMap < Integer , Integer > um = new HashMap < Integer , Integer > ( ) ;
  int mod_arr [ ] = new int [ n ] ;
  int max = 0 ;
  int curr_sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    curr_sum += arr [ i ] ;
    mod_arr [ i ] = ( ( curr_sum % k ) + k ) % k ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( mod_arr [ i ] == 0 ) max = i + 1 ;
    else if ( um . containsKey ( mod_arr [ i ] ) == false ) um . put ( mod_arr [ i ] , i ) ;
    else if ( max < ( i - um . get ( mod_arr [ i ] ) ) ) max = i - um . get ( mod_arr [ i ] ) ;
  }
  return max ;
}


//TOFILL

}
