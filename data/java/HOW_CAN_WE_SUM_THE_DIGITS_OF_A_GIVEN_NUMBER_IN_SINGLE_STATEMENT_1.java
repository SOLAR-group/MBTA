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
public class HOW_CAN_WE_SUM_THE_DIGITS_OF_A_GIVEN_NUMBER_IN_SINGLE_STATEMENT_1{
static int f_gold ( int n ) {
  int sum ;
  for ( sum = 0 ;
  n > 0 ;
  sum += n % 10 , n /= 10 ) ;
  return sum ;
}


//TOFILL

}
