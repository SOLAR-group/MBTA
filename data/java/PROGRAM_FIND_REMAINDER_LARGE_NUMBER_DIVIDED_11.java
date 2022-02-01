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
public class PROGRAM_FIND_REMAINDER_LARGE_NUMBER_DIVIDED_11{
static int f_gold ( String str ) {
  int len = str . length ( ) ;
  int num , rem = 0 ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    num = rem * 10 + ( str . charAt ( i ) - '0' ) ;
    rem = num % 11 ;
  }
  return rem ;
}


//TOFILL

}
