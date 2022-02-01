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
public class FIND_MAXIMUM_HEIGHT_PYRAMID_FROM_THE_GIVEN_ARRAY_OF_OBJECTS{
static int f_gold ( int [ ] boxes , int n ) {
  Arrays . sort ( boxes ) ;
  int ans = 1 ;
  int prev_width = boxes [ 0 ] ;
  int prev_count = 1 ;
  int curr_count = 0 ;
  int curr_width = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    curr_width += boxes [ i ] ;
    curr_count += 1 ;
    if ( curr_width > prev_width && curr_count > prev_count ) {
      prev_width = curr_width ;
      prev_count = curr_count ;
      curr_count = 0 ;
      curr_width = 0 ;
      ans ++ ;
    }
  }
  return ans ;
}


//TOFILL

}
