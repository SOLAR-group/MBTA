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
public class FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT{
static int f_gold ( int n ) {
  if ( n == 0 ) return 0 ;
  while ( n != 1 ) {
    if ( n % 4 != 0 ) return 0 ;
    n = n / 4 ;
  }
  return 1 ;
}


//TOFILL

}
