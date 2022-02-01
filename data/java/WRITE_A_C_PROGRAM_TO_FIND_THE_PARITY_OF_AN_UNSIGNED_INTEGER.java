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
public class WRITE_A_C_PROGRAM_TO_FIND_THE_PARITY_OF_AN_UNSIGNED_INTEGER{
static boolean f_gold ( int n ) {
  boolean parity = false ;
  while ( n != 0 ) {
    parity = ! parity ;
    n = n & ( n - 1 ) ;
  }
  return parity ;
}


//TOFILL

}
