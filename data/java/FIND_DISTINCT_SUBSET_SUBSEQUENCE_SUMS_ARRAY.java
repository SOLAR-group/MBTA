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
public class FIND_DISTINCT_SUBSET_SUBSEQUENCE_SUMS_ARRAY{
static void f_gold ( int arr [ ] , int n ) {
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) sum += arr [ i ] ;
  boolean [ ] [ ] dp = new boolean [ n + 1 ] [ sum + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) dp [ i ] [ 0 ] = true ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    dp [ i ] [ arr [ i - 1 ] ] = true ;
    for ( int j = 1 ;
    j <= sum ;
    j ++ ) {
      if ( dp [ i - 1 ] [ j ] == true ) {
        dp [ i ] [ j ] = true ;
        dp [ i ] [ j + arr [ i - 1 ] ] = true ;
      }
    }
  }
  for ( int j = 0 ;
  j <= sum ;
  j ++ ) if ( dp [ n ] [ j ] == true ) System . out . print ( j + " " ) ;
}


//TOFILL

}
