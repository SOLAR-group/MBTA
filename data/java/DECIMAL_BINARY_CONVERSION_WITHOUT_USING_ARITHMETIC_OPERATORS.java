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
public class DECIMAL_BINARY_CONVERSION_WITHOUT_USING_ARITHMETIC_OPERATORS{
static String f_gold ( int n ) {
  if ( n == 0 ) return "0" ;
  String bin = "" ;
  while ( n > 0 ) {
    bin = ( ( n & 1 ) == 0 ? '0' : '1' ) + bin ;
    n >>= 1 ;
  }
  return bin ;
}


//TOFILL

}
