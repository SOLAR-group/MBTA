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
public class COUNT_SET_BITS_IN_AN_INTEGER{
static int f_gold ( int n ) {
  int count = 0 ;
  while ( n > 0 ) {
    count += n & 1 ;
    n >>= 1 ;
  }
  return count ;
}


//TOFILL

}
