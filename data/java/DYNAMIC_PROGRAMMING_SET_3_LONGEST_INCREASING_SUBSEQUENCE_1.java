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
public class DYNAMIC_PROGRAMMING_SET_3_LONGEST_INCREASING_SUBSEQUENCE_1{
static int f_gold ( int arr [ ] , int n ) {
  int f_gold [ ] = new int [ n ] ;
  int i , j , max = 0 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) f_gold [ i ] = 1 ;
  for ( i = 1 ;
  i < n ;
  i ++ ) for ( j = 0 ;
  j < i ;
  j ++ ) if ( arr [ i ] > arr [ j ] && f_gold [ i ] < f_gold [ j ] + 1 ) f_gold [ i ] = f_gold [ j ] + 1 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) if ( max < f_gold [ i ] ) max = f_gold [ i ] ;
  return max ;
}


//TOFILL

}
