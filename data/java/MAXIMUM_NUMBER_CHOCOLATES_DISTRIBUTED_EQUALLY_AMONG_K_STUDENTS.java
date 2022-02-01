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
public class MAXIMUM_NUMBER_CHOCOLATES_DISTRIBUTED_EQUALLY_AMONG_K_STUDENTS{
static int f_gold ( int arr [ ] , int n , int k ) {
  HashMap < Integer , Integer > um = new HashMap < Integer , Integer > ( ) ;
  int [ ] sum = new int [ n ] ;
  int curr_rem ;
  int maxSum = 0 ;
  sum [ 0 ] = arr [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) sum [ i ] = sum [ i - 1 ] + arr [ i ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    curr_rem = sum [ i ] % k ;
    if ( curr_rem == 0 ) {
      if ( maxSum < sum [ i ] ) maxSum = sum [ i ] ;
    }
    else if ( ! um . containsKey ( curr_rem ) ) um . put ( curr_rem , i ) ;
    else if ( maxSum < ( sum [ i ] - sum [ um . get ( curr_rem ) ] ) ) maxSum = sum [ i ] - sum [ um . get ( curr_rem ) ] ;
  }
  return ( maxSum / k ) ;
}


//TOFILL

}
