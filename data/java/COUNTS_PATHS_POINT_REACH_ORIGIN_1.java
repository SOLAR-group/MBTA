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
public class COUNTS_PATHS_POINT_REACH_ORIGIN_1{
static int f_gold ( int n , int m ) {
  int dp [ ] [ ] = new int [ n + 1 ] [ m + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) dp [ i ] [ 0 ] = 1 ;
  for ( int i = 0 ;
  i <= m ;
  i ++ ) dp [ 0 ] [ i ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) for ( int j = 1 ;
  j <= m ;
  j ++ ) dp [ i ] [ j ] = dp [ i - 1 ] [ j ] + dp [ i ] [ j - 1 ] ;
  return dp [ n ] [ m ] ;
}


//TOFILL

}
