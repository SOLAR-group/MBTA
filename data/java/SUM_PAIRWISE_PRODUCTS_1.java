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
public class SUM_PAIRWISE_PRODUCTS_1{
static int f_gold ( int n ) {
  int multiTerms = n * ( n + 1 ) / 2 ;
  int sum = multiTerms ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    multiTerms = multiTerms - ( i - 1 ) ;
    sum = sum + multiTerms * i ;
  }
  return sum ;
}


//TOFILL

}
