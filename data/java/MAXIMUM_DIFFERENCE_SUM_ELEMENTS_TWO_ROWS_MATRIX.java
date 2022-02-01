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
public class MAXIMUM_DIFFERENCE_SUM_ELEMENTS_TWO_ROWS_MATRIX{
static int f_gold ( int mat [ ] [ ] , int m , int n ) {
  int rowSum [ ] = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int sum = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) sum += mat [ i ] [ j ] ;
    rowSum [ i ] = sum ;
  }
  int max_diff = rowSum [ 1 ] - rowSum [ 0 ] ;
  int min_element = rowSum [ 0 ] ;
  for ( int i = 1 ;
  i < m ;
  i ++ ) {
    if ( rowSum [ i ] - min_element > max_diff ) max_diff = rowSum [ i ] - min_element ;
    if ( rowSum [ i ] < min_element ) min_element = rowSum [ i ] ;
  }
  return max_diff ;
}


//TOFILL

}
