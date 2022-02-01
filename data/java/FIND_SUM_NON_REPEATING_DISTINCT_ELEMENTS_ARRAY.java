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
public class FIND_SUM_NON_REPEATING_DISTINCT_ELEMENTS_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int sum = 0 ;
  HashSet < Integer > s = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! s . contains ( arr [ i ] ) ) {
      sum += arr [ i ] ;
      s . add ( arr [ i ] ) ;
    }
  }
  return sum ;
}


//TOFILL

}
