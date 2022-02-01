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
public class SUM_SERIES_23_45_67_89_UPTO_N_TERMS{
static double f_gold ( int n ) {
  int i = 1 ;
  double res = 0.0 ;
  boolean sign = true ;
  while ( n > 0 ) {
    n -- ;
    if ( sign ) {
      sign = ! sign ;
      res = res + ( double ) ++ i / ++ i ;
    }
    else {
      sign = ! sign ;
      res = res - ( double ) ++ i / ++ i ;
    }
  }
  return res ;
}


//TOFILL

}
