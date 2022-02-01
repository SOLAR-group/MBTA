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
public class WRITE_ONE_LINE_C_FUNCTION_TO_FIND_WHETHER_A_NO_IS_POWER_OF_TWO{
static boolean f_gold ( int n ) {
  if ( n == 0 ) return false ;
  while ( n != 1 ) {
    if ( n % 2 != 0 ) return false ;
    n = n / 2 ;
  }
  return true ;
}


//TOFILL

}
