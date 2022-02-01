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
public class MAXIMUM_AVERAGE_SUM_PARTITION_ARRAY{
static double f_gold ( int [ ] A , int K ) {
  int n = A . length ;
  double [ ] pre_sum = new double [ n + 1 ] ;
  pre_sum [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) pre_sum [ i + 1 ] = pre_sum [ i ] + A [ i ] ;
  double [ ] dp = new double [ n ] ;
  double sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) dp [ i ] = ( pre_sum [ n ] - pre_sum [ i ] ) / ( n - i ) ;
  for ( int k = 0 ;
  k < K - 1 ;
  k ++ ) for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = i + 1 ;
  j < n ;
  j ++ ) dp [ i ] = Math . max ( dp [ i ] , ( pre_sum [ j ] - pre_sum [ i ] ) / ( j - i ) + dp [ j ] ) ;
  return dp [ 0 ] ;
}


//TOFILL

}
