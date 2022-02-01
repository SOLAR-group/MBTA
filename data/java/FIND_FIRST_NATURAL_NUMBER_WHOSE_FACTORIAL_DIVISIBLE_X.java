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
public class FIND_FIRST_NATURAL_NUMBER_WHOSE_FACTORIAL_DIVISIBLE_X{
static int f_gold ( int x ) {
  int i = 1 ;
  int fact = 1 ;
  for ( i = 1 ;
  i < x ;
  i ++ ) {
    fact = fact * i ;
    if ( fact % x == 0 ) break ;
  }
  return i ;
}


//TOFILL

}
