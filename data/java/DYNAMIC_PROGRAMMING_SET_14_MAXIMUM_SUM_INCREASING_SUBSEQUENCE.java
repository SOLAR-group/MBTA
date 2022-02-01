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
public class DYNAMIC_PROGRAMMING_SET_14_MAXIMUM_SUM_INCREASING_SUBSEQUENCE{
static int f_gold ( int arr [ ] , int n ) {
  int i , j , max = 0 ;
  int msis [ ] = new int [ n ] ;
  for ( i = 0 ;
  i < n ;
  i ++ ) msis [ i ] = arr [ i ] ;
  for ( i = 1 ;
  i < n ;
  i ++ ) for ( j = 0 ;
  j < i ;
  j ++ ) if ( arr [ i ] > arr [ j ] && msis [ i ] < msis [ j ] + arr [ i ] ) msis [ i ] = msis [ j ] + arr [ i ] ;
  for ( i = 0 ;
  i < n ;
  i ++ ) if ( max < msis [ i ] ) max = msis [ i ] ;
  return max ;
}


//TOFILL

}
