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
public class COUNT_POSSIBLE_PATHS_TOP_LEFT_BOTTOM_RIGHT_NXM_MATRIX_1{
static int f_gold ( int m , int n ) {
  int count [ ] [ ] = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) count [ i ] [ 0 ] = 1 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) count [ 0 ] [ j ] = 1 ;
  for ( int i = 1 ;
  i < m ;
  i ++ ) {
    for ( int j = 1 ;
    j < n ;
    j ++ ) count [ i ] [ j ] = count [ i - 1 ] [ j ] + count [ i ] [ j - 1 ] ;
  }
  return count [ m - 1 ] [ n - 1 ] ;
}


//TOFILL

}
