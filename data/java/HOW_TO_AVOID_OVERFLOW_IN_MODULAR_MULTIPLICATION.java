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
public class HOW_TO_AVOID_OVERFLOW_IN_MODULAR_MULTIPLICATION{
static long f_gold ( long a , long b , long mod ) {
  long res = 0 ;
  a = a % mod ;
  while ( b > 0 ) {
    if ( b % 2 == 1 ) {
      res = ( res + a ) % mod ;
    }
    a = ( a * 2 ) % mod ;
    b /= 2 ;
  }
  return res % mod ;
}


//TOFILL

}
