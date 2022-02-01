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
public class MAXIMUM_DISTANCE_TWO_OCCURRENCES_ELEMENT_ARRAY{
static int f_gold ( int [ ] arr , int n ) {
  HashMap < Integer , Integer > map = new HashMap < > ( ) ;
  int max_dist = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! map . containsKey ( arr [ i ] ) ) map . put ( arr [ i ] , i ) ;
    else max_dist = Math . max ( max_dist , i - map . get ( arr [ i ] ) ) ;
  }
  return max_dist ;
}


//TOFILL

}
