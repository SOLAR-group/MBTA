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
public class PROGRAM_DECIMAL_BINARY_CONVERSION_2{
static int f_gold ( int N ) {
  int B_Number = 0 ;
  int cnt = 0 ;
  while ( N != 0 ) {
    int rem = N % 2 ;
    double c = Math . pow ( 10 , cnt ) ;
    B_Number += rem * c ;
    N /= 2 ;
    cnt ++ ;
  }
  return B_Number ;
}


//TOFILL

}
