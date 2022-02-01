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
public class COUNT_EVEN_LENGTH_BINARY_SEQUENCES_WITH_SAME_SUM_OF_FIRST_AND_SECOND_HALF_BITS_1{
static int f_gold ( int n ) {
  int nCr = 1 , res = 1 ;
  for ( int r = 1 ;
  r <= n ;
  r ++ ) {
    nCr = ( nCr * ( n + 1 - r ) ) / r ;
    res += nCr * nCr ;
  }
  return res ;
}


//TOFILL

}
