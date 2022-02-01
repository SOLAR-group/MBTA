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
public class SQUARE_PYRAMIDAL_NUMBER_SUM_SQUARES{
static int f_gold ( int s ) {
  int sum = 0 ;
  for ( int n = 1 ;
  sum < s ;
  n ++ ) {
    sum += n * n ;
    if ( sum == s ) return n ;
  }
  return - 1 ;
}


//TOFILL

}
