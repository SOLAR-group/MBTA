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
public class MAXIMUM_SUM_BITONIC_SUBARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int [ ] msis = new int [ n ] ;
  int [ ] msds = new int [ n ] ;
  int max_sum = Integer . MIN_VALUE ;
  msis [ 0 ] = arr [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) if ( arr [ i ] > arr [ i - 1 ] ) msis [ i ] = msis [ i - 1 ] + arr [ i ] ;
  else msis [ i ] = arr [ i ] ;
  msds [ n - 1 ] = arr [ n - 1 ] ;
  for ( int i = n - 2 ;
  i >= 0 ;
  i -- ) if ( arr [ i ] > arr [ i + 1 ] ) msds [ i ] = msds [ i + 1 ] + arr [ i ] ;
  else msds [ i ] = arr [ i ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( max_sum < ( msis [ i ] + msds [ i ] - arr [ i ] ) ) max_sum = msis [ i ] + msds [ i ] - arr [ i ] ;
  return max_sum ;
}


//TOFILL

}
