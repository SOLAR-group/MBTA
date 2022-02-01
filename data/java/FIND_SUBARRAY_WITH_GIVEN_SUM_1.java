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
public class FIND_SUBARRAY_WITH_GIVEN_SUM_1{
static int f_gold ( int arr [ ] , int n , int sum ) {
  int curr_sum = arr [ 0 ] , start = 0 , i ;
  for ( i = 1 ;
  i <= n ;
  i ++ ) {
    while ( curr_sum > sum && start < i - 1 ) {
      curr_sum = curr_sum - arr [ start ] ;
      start ++ ;
    }
    if ( curr_sum == sum ) {
      int p = i - 1 ;
      System . out . println ( "Sum found between indexes " + start + " and " + p ) ;
      return 1 ;
    }
    if ( i < n ) curr_sum = curr_sum + arr [ i ] ;
  }
  System . out . println ( "No subarray found" ) ;
  return 0 ;
}


//TOFILL

}
