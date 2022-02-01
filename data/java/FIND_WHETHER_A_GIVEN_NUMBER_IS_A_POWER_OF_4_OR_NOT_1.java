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
public class FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT_1{
static int f_gold ( int n ) {
  int count = 0 ;
  int x = n & ( n - 1 ) ;
  if ( n > 0 && x == 0 ) {
    while ( n > 1 ) {
      n >>= 1 ;
      count += 1 ;
    }
    return ( count % 2 == 0 ) ? 1 : 0 ;
  }
  return 0 ;
}


//TOFILL

}
