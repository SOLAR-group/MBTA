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
public class COUNT_NUMBER_BINARY_STRINGS_WITHOUT_CONSECUTIVE_1S{
static int f_gold ( int n ) {
  int a [ ] = new int [ n ] ;
  int b [ ] = new int [ n ] ;
  a [ 0 ] = b [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    a [ i ] = a [ i - 1 ] + b [ i - 1 ] ;
    b [ i ] = a [ i - 1 ] ;
  }
  return a [ n - 1 ] + b [ n - 1 ] ;
}


//TOFILL

}
