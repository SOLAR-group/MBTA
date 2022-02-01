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
public class MAXIMUM_SUBARRAY_SUM_ARRAY_CREATED_REPEATED_CONCATENATION{
static int f_gold ( int a [ ] , int n , int k ) {
  int max_so_far = 0 ;
  int INT_MIN , max_ending_here = 0 ;
  for ( int i = 0 ;
  i < n * k ;
  i ++ ) {
    max_ending_here = max_ending_here + a [ i % n ] ;
    if ( max_so_far < max_ending_here ) max_so_far = max_ending_here ;
    if ( max_ending_here < 0 ) max_ending_here = 0 ;
  }
  return max_so_far ;
}


//TOFILL

}
