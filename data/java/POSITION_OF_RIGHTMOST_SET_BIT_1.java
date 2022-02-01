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
public class POSITION_OF_RIGHTMOST_SET_BIT_1{
static int f_gold ( int n ) {
  int position = 1 ;
  int m = 1 ;
  while ( ( n & m ) == 0 ) {
    m = m << 1 ;
    position ++ ;
  }
  return position ;
}


//TOFILL

}
