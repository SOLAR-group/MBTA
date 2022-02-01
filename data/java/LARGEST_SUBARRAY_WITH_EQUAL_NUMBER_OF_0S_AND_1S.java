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
public class LARGEST_SUBARRAY_WITH_EQUAL_NUMBER_OF_0S_AND_1S{
static int f_gold ( int arr [ ] , int n ) {
  int sum = 0 ;
  int maxsize = - 1 , startindex = 0 ;
  int endindex = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    sum = ( arr [ i ] == 0 ) ? - 1 : 1 ;
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      if ( arr [ j ] == 0 ) sum += - 1 ;
      else sum += 1 ;
      if ( sum == 0 && maxsize < j - i + 1 ) {
        maxsize = j - i + 1 ;
        startindex = i ;
      }
    }
  }
  endindex = startindex + maxsize - 1 ;
  if ( maxsize == - 1 ) System . out . println ( "No such subarray" ) ;
  else System . out . println ( startindex + " to " + endindex ) ;
  return maxsize ;
}


//TOFILL

}
