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
public class CHANGE_BITS_CAN_MADE_ONE_FLIP{
static boolean f_gold ( String str ) {
  int zeros = 0 , ones = 0 ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    char ch = str . charAt ( i ) ;
    if ( ch == '0' ) ++ zeros ;
    else ++ ones ;
  }
  return ( zeros == 1 || ones == 1 ) ;
}


//TOFILL

}
