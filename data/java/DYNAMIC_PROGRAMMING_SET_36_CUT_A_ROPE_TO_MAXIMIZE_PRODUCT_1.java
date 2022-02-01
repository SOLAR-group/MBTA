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
public class DYNAMIC_PROGRAMMING_SET_36_CUT_A_ROPE_TO_MAXIMIZE_PRODUCT_1{
static int f_gold ( int n ) {
  if ( n == 2 || n == 3 ) return ( n - 1 ) ;
  int res = 1 ;
  while ( n > 4 ) {
    n -= 3 ;
    res *= 3 ;
  }
  return ( n * res ) ;
}


//TOFILL

}
