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
public class MINIMIZE_THE_SUM_OF_DIGITS_OF_A_AND_B_SUCH_THAT_A_B_N{
static int f_gold ( int n ) {
  int sum = 0 ;
  while ( n > 0 ) {
    sum += ( n % 10 ) ;
    n /= 10 ;
  }
  if ( sum == 1 ) return 10 ;
  return sum ;
}


//TOFILL

}
