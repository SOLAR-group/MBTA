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
public class COUNT_MINIMUM_NUMBER_SUBSETS_SUBSEQUENCES_CONSECUTIVE_NUMBERS{
static int f_gold ( int arr [ ] , int n ) {
  Arrays . sort ( arr ) ;
  int count = 1 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( arr [ i ] + 1 != arr [ i + 1 ] ) count ++ ;
  }
  return count ;
}


//TOFILL

}
