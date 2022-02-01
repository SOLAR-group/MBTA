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
public class K_TH_LARGEST_SUM_CONTIGUOUS_SUBARRAY{
static int f_gold ( int arr [ ] , int n , int k ) {
  int sum [ ] = new int [ n + 1 ] ;
  sum [ 0 ] = 0 ;
  sum [ 1 ] = arr [ 0 ] ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) sum [ i ] = sum [ i - 1 ] + arr [ i - 1 ] ;
  PriorityQueue < Integer > Q = new PriorityQueue < Integer > ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = i ;
    j <= n ;
    j ++ ) {
      int x = sum [ j ] - sum [ i - 1 ] ;
      if ( Q . size ( ) < k ) Q . add ( x ) ;
      else {
        if ( Q . peek ( ) < x ) {
          Q . poll ( ) ;
          Q . add ( x ) ;
        }
      }
    }
  }
  return Q . poll ( ) ;
}


//TOFILL

}
