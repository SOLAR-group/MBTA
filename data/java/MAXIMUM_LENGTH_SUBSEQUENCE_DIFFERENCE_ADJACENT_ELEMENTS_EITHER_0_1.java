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
public class MAXIMUM_LENGTH_SUBSEQUENCE_DIFFERENCE_ADJACENT_ELEMENTS_EITHER_0_1{
public static int f_gold ( int arr [ ] , int n ) {
  int mls [ ] = new int [ n ] , max = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) mls [ i ] = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < i ;
  j ++ ) if ( Math . abs ( arr [ i ] - arr [ j ] ) <= 1 && mls [ i ] < mls [ j ] + 1 ) mls [ i ] = mls [ j ] + 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( max < mls [ i ] ) max = mls [ i ] ;
  return max ;
}


//TOFILL

}
