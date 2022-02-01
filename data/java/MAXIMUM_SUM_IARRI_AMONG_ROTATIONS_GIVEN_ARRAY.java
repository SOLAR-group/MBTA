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
public class MAXIMUM_SUM_IARRI_AMONG_ROTATIONS_GIVEN_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int res = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int curr_sum = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int index = ( i + j ) % n ;
      curr_sum += j * arr [ index ] ;
    }
    res = Math . max ( res , curr_sum ) ;
  }
  return res ;
}


//TOFILL

}
