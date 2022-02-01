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
public class MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG{
public static int f_gold ( int cost [ ] , int n , int W ) {
  Vector < Integer > val = new Vector < Integer > ( ) ;
  Vector < Integer > wt = new Vector < Integer > ( ) ;
  int size = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( cost [ i ] != - 1 ) {
      val . add ( cost [ i ] ) ;
      wt . add ( i + 1 ) ;
      size ++ ;
    }
  }
  n = size ;
  int min_cost [ ] [ ] = new int [ n + 1 ] [ W + 1 ] ;
  for ( int i = 0 ;
  i <= W ;
  i ++ ) min_cost [ 0 ] [ i ] = Integer . MAX_VALUE ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) min_cost [ i ] [ 0 ] = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= W ;
    j ++ ) {
      if ( wt . get ( i - 1 ) > j ) min_cost [ i ] [ j ] = min_cost [ i - 1 ] [ j ] ;
      else min_cost [ i ] [ j ] = Math . min ( min_cost [ i - 1 ] [ j ] , min_cost [ i ] [ j - wt . get ( i - 1 ) ] + val . get ( i - 1 ) ) ;
    }
  }
  return ( min_cost [ n ] [ W ] == Integer . MAX_VALUE ) ? - 1 : min_cost [ n ] [ W ] ;
}


//TOFILL

}
