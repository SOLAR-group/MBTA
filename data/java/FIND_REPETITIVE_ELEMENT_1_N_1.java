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
public class FIND_REPETITIVE_ELEMENT_1_N_1{
static int f_gold ( int [ ] arr , int n ) {
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) sum += arr [ i ] ;
  return sum - ( ( ( n - 1 ) * n ) / 2 ) ;
}


//TOFILL

}
