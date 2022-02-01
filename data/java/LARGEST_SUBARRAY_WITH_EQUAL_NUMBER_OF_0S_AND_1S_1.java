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
public class LARGEST_SUBARRAY_WITH_EQUAL_NUMBER_OF_0S_AND_1S_1{
static int f_gold ( int arr [ ] , int n ) {
  HashMap < Integer , Integer > hM = new HashMap < Integer , Integer > ( ) ;
  int sum = 0 ;
  int max_len = 0 ;
  int ending_index = - 1 ;
  int start_index = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = ( arr [ i ] == 0 ) ? - 1 : 1 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum += arr [ i ] ;
    if ( sum == 0 ) {
      max_len = i + 1 ;
      ending_index = i ;
    }
    if ( hM . containsKey ( sum + n ) ) {
      if ( max_len < i - hM . get ( sum + n ) ) {
        max_len = i - hM . get ( sum + n ) ;
        ending_index = i ;
      }
    }
    else hM . put ( sum + n , i ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = ( arr [ i ] == - 1 ) ? 0 : 1 ;
  }
  int end = ending_index - max_len + 1 ;
  System . out . println ( end + " to " + ending_index ) ;
  return max_len ;
}


//TOFILL

}
