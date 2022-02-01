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
public class FIND_THE_MAXIMUM_SUBARRAY_XOR_IN_A_GIVEN_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int ans = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int curr_xor = 0 ;
    for ( int j = i ;
    j < n ;
    j ++ ) {
      curr_xor = curr_xor ^ arr [ j ] ;
      ans = Math . max ( ans , curr_xor ) ;
    }
  }
  return ans ;
}


//TOFILL

}
