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
public class HOW_TO_CHECK_IF_A_GIVEN_ARRAY_REPRESENTS_A_BINARY_HEAP_1{
static boolean f_gold ( int arr [ ] , int n ) {
  for ( int i = 0 ;
  i <= ( n - 2 ) / 2 ;
  i ++ ) {
    if ( arr [ 2 * i + 1 ] > arr [ i ] ) {
      return false ;
    }
    if ( 2 * i + 2 < n && arr [ 2 * i + 2 ] > arr [ i ] ) {
      return false ;
    }
  }
  return true ;
}


//TOFILL

}
