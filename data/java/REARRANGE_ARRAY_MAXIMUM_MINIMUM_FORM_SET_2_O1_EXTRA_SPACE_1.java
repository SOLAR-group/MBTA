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
class REARRANGE_ARRAY_MAXIMUM_MINIMUM_FORM_SET_2_O1_EXTRA_SPACE_1{
public static void f_gold ( int arr [ ] , int n ) {
  int max_ele = arr [ n - 1 ] ;
  int min_ele = arr [ 0 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      arr [ i ] = max_ele ;
      max_ele -= 1 ;
    }
    else {
      arr [ i ] = min_ele ;
      min_ele += 1 ;
    }
  }
}


//TOFILL

}
