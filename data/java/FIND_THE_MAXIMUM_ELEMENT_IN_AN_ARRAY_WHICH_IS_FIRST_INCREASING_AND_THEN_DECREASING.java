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
public class FIND_THE_MAXIMUM_ELEMENT_IN_AN_ARRAY_WHICH_IS_FIRST_INCREASING_AND_THEN_DECREASING{
static int f_gold ( int arr [ ] , int low , int high ) {
  int max = arr [ low ] ;
  int i ;
  for ( i = low ;
  i <= high ;
  i ++ ) {
    if ( arr [ i ] > max ) max = arr [ i ] ;
  }
  return max ;
}


//TOFILL

}
