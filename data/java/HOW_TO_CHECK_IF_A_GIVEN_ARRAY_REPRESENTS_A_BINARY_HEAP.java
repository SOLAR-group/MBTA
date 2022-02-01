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
public class HOW_TO_CHECK_IF_A_GIVEN_ARRAY_REPRESENTS_A_BINARY_HEAP{
static boolean f_gold ( int arr [ ] , int i , int n ) {
  if ( i > ( n - 2 ) / 2 ) {
    return true ;
  }
  if ( arr [ i ] >= arr [ 2 * i + 1 ] && arr [ i ] >= arr [ 2 * i + 2 ] && f_gold ( arr , 2 * i + 1 , n ) && f_gold ( arr , 2 * i + 2 , n ) ) {
    return true ;
  }
  return false ;
}


//TOFILL

}
