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
public class FIND_THE_MISSING_NUMBER_1{
static int f_gold ( int a [ ] , int n ) {
  int total = 1 ;
  for ( int i = 2 ;
  i <= ( n + 1 ) ;
  i ++ ) {
    total += i ;
    total -= a [ i - 2 ] ;
  }
  return total ;
}


//TOFILL

}
