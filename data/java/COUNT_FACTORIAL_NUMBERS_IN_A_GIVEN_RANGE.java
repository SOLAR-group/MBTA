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
public class COUNT_FACTORIAL_NUMBERS_IN_A_GIVEN_RANGE{
static int f_gold ( int low , int high ) {
  int fact = 1 , x = 1 ;
  while ( fact < low ) {
    fact = fact * x ;
    x ++ ;
  }
  int res = 0 ;
  while ( fact <= high ) {
    res ++ ;
    fact = fact * x ;
    x ++ ;
  }
  return res ;
}


//TOFILL

}
