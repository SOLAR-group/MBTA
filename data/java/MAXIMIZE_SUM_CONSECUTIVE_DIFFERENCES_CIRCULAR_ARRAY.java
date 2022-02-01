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
public class MAXIMIZE_SUM_CONSECUTIVE_DIFFERENCES_CIRCULAR_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int sum = 0 ;
  Arrays . sort ( arr ) ;
  for ( int i = 0 ;
  i < n / 2 ;
  i ++ ) {
    sum -= ( 2 * arr [ i ] ) ;
    sum += ( 2 * arr [ n - i - 1 ] ) ;
  }
  return sum ;
}


//TOFILL

}
