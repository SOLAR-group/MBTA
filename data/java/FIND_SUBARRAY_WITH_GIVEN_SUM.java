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
public class FIND_SUBARRAY_WITH_GIVEN_SUM{
static int f_gold ( int arr [ ] , int n , int sum ) {
  int curr_sum , i , j ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    curr_sum = arr [ i ] ;
    for ( j = i + 1 ;
    j <= n ;
    j ++ ) {
      if ( curr_sum == sum ) {
        int p = j - 1 ;
        System . out . println ( "Sum found between indexes " + i + " and " + p ) ;
        return 1 ;
      }
      if ( curr_sum > sum || j == n ) break ;
      curr_sum = curr_sum + arr [ j ] ;
    }
  }
  System . out . println ( "No subarray found" ) ;
  return 0 ;
}


//TOFILL

}
