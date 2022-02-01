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
public class REMOVE_MINIMUM_ELEMENTS_EITHER_SIDE_2MIN_MAX{
static int f_gold ( int arr [ ] , int n ) {
  int longest_start = - 1 , longest_end = 0 ;
  for ( int start = 0 ;
  start < n ;
  start ++ ) {
    int min = Integer . MAX_VALUE , max = Integer . MIN_VALUE ;
    for ( int end = start ;
    end < n ;
    end ++ ) {
      int val = arr [ end ] ;
      if ( val < min ) {
        min = val ;
      }
      if ( val > max ) {
        max = val ;
      }
      if ( 2 * min <= max ) {
        break ;
      }
      if ( end - start > longest_end - longest_start || longest_start == - 1 ) {
        longest_start = start ;
        longest_end = end ;
      }
    }
  }
  if ( longest_start == - 1 ) {
    return n ;
  }
  return ( n - ( longest_end - longest_start + 1 ) ) ;
}


//TOFILL

}
