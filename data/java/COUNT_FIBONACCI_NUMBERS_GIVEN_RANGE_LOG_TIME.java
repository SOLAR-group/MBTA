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
public class COUNT_FIBONACCI_NUMBERS_GIVEN_RANGE_LOG_TIME{
static int f_gold ( int low , int high ) {
  int f1 = 0 , f2 = 1 , f3 = 1 ;
  int result = 0 ;
  while ( f1 <= high ) {
    if ( f1 >= low ) result ++ ;
    f1 = f2 ;
    f2 = f3 ;
    f3 = f1 + f2 ;
  }
  return result ;
}


//TOFILL

}
