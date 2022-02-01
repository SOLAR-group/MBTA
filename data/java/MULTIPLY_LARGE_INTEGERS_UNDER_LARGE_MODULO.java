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
public class MULTIPLY_LARGE_INTEGERS_UNDER_LARGE_MODULO{
static long f_gold ( long a , long b , long mod ) {
  long res = 0 ;
  a %= mod ;
  while ( b > 0 ) {
    if ( ( b & 1 ) > 0 ) {
      res = ( res + a ) % mod ;
    }
    a = ( 2 * a ) % mod ;
    b >>= 1 ;
  }
  return res ;
}


//TOFILL

}
