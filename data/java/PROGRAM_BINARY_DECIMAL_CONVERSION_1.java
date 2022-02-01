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
public class PROGRAM_BINARY_DECIMAL_CONVERSION_1{
static int f_gold ( String n ) {
  String num = n ;
  int dec_value = 0 ;
  int base = 1 ;
  int len = num . length ( ) ;
  for ( int i = len - 1 ;
  i >= 0 ;
  i -- ) {
    if ( num . charAt ( i ) == '1' ) dec_value += base ;
    base = base * 2 ;
  }
  return dec_value ;
}


//TOFILL

}
