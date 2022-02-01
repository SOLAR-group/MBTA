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
public class FIND_MINIMUM_SUM_FACTORS_NUMBER{
static int f_gold ( int num ) {
  int sum = 0 ;
  for ( int i = 2 ;
  i * i <= num ;
  i ++ ) {
    while ( num % i == 0 ) {
      sum += i ;
      num /= i ;
    }
  }
  sum += num ;
  return sum ;
}


//TOFILL

}
