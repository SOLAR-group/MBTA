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
public class SUM_PAIRWISE_PRODUCTS{
static int f_gold ( int n ) {
  int sum = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) for ( int j = i ;
  j <= n ;
  j ++ ) sum = sum + i * j ;
  return sum ;
}


//TOFILL

}
