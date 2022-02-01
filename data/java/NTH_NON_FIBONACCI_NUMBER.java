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
public class NTH_NON_FIBONACCI_NUMBER{
static int f_gold ( int n ) {
  int prevPrev = 1 , prev = 2 , curr = 3 ;
  while ( n > 0 ) {
    prevPrev = prev ;
    prev = curr ;
    curr = prevPrev + prev ;
    n = n - ( curr - prev - 1 ) ;
  }
  n = n + ( curr - prev - 1 ) ;
  return prev + n ;
}


//TOFILL

}
