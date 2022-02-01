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
public class FIND_ROTATION_COUNT_ROTATED_SORTED_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int min = arr [ 0 ] , min_index = - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( min > arr [ i ] ) {
      min = arr [ i ] ;
      min_index = i ;
    }
  }
  return min_index ;
}


//TOFILL

}
