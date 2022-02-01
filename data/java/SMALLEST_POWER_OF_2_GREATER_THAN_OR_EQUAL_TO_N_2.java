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
public class SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_2{
static int f_gold ( int n ) {
  n -- ;
  n |= n >> 1 ;
  n |= n >> 2 ;
  n |= n >> 4 ;
  n |= n >> 8 ;
  n |= n >> 16 ;
  n ++ ;
  return n ;
}


//TOFILL

}
