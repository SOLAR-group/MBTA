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
public class FAST_MULTIPLICATION_METHOD_WITHOUT_USING_MULTIPLICATION_OPERATOR_RUSSIAN_PEASANTS_ALGORITHM{
static int f_gold ( int a , int b ) {
  int res = 0 ;
  while ( b > 0 ) {
    if ( ( b & 1 ) != 0 ) res = res + a ;
    a = a << 1 ;
    b = b >> 1 ;
  }
  return res ;
}


//TOFILL

}
