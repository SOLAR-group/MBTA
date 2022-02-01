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
public class SIZE_SUBARRAY_MAXIMUM_SUM{
static int f_gold ( int a [ ] , int size ) {
  int max_so_far = Integer . MIN_VALUE , max_ending_here = 0 , start = 0 , end = 0 , s = 0 ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    max_ending_here += a [ i ] ;
    if ( max_so_far < max_ending_here ) {
      max_so_far = max_ending_here ;
      start = s ;
      end = i ;
    }
    if ( max_ending_here < 0 ) {
      max_ending_here = 0 ;
      s = i + 1 ;
    }
  }
  return ( end - start + 1 ) ;
}


//TOFILL

}
