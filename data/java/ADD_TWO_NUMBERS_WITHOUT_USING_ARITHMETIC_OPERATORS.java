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
public class ADD_TWO_NUMBERS_WITHOUT_USING_ARITHMETIC_OPERATORS{
static int f_gold ( int x , int y ) {
  while ( y != 0 ) {
    int carry = x & y ;
    x = x ^ y ;
    y = carry << 1 ;
  }
  return x ;
}


//TOFILL

}
