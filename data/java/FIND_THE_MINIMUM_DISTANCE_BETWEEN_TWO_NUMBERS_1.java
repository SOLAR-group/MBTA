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
public class FIND_THE_MINIMUM_DISTANCE_BETWEEN_TWO_NUMBERS_1{
static int f_gold ( int arr [ ] , int n , int x , int y ) {
  int i = 0 ;
  int min_dist = Integer . MAX_VALUE ;
  int prev = 0 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] == x || arr [ i ] == y ) {
      prev = i ;
      break ;
    }
  }
  for ( ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] == x || arr [ i ] == y ) {
      if ( arr [ prev ] != arr [ i ] && ( i - prev ) < min_dist ) {
        min_dist = i - prev ;
        prev = i ;
      }
      else prev = i ;
    }
  }
  return min_dist ;
}


//TOFILL

}
