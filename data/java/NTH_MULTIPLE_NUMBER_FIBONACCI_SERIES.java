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
public class NTH_MULTIPLE_NUMBER_FIBONACCI_SERIES{
public static int f_gold ( int k , int n ) {
  long f1 = 0 , f2 = 1 , f3 ;
  int i = 2 ;
  while ( i != 0 ) {
    f3 = f1 + f2 ;
    f1 = f2 ;
    f2 = f3 ;
    if ( f2 % k == 0 ) {
      return n * i ;
    }
    i ++ ;
  }
  return 0 ;
}


//TOFILL

}
