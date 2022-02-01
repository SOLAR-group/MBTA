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
public class COUNT_ENTRIES_EQUAL_TO_X_IN_A_SPECIAL_MATRIX{
static int f_gold ( int n , int x ) {
  int f_gold = 0 ;
  for ( int i = 1 ;
  i <= n && i <= x ;
  i ++ ) {
    if ( x / i <= n && x % i == 0 ) f_gold ++ ;
  }
  return f_gold ;
}


//TOFILL

}
