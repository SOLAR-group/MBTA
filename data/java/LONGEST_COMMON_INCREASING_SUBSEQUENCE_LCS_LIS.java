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
public class LONGEST_COMMON_INCREASING_SUBSEQUENCE_LCS_LIS{
static int f_gold ( int arr1 [ ] , int n , int arr2 [ ] , int m ) {
  int table [ ] = new int [ m ] ;
  for ( int j = 0 ;
  j < m ;
  j ++ ) table [ j ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int current = 0 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( arr1 [ i ] == arr2 [ j ] ) if ( current + 1 > table [ j ] ) table [ j ] = current + 1 ;
      if ( arr1 [ i ] > arr2 [ j ] ) if ( table [ j ] > current ) current = table [ j ] ;
    }
  }
  int result = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) if ( table [ i ] > result ) result = table [ i ] ;
  return result ;
}


//TOFILL

}
