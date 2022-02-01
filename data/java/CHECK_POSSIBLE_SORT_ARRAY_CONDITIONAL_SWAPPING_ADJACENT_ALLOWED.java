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
public class CHECK_POSSIBLE_SORT_ARRAY_CONDITIONAL_SWAPPING_ADJACENT_ALLOWED{
static boolean f_gold ( int arr [ ] , int n ) {
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( arr [ i ] > arr [ i + 1 ] ) {
      if ( arr [ i ] - arr [ i + 1 ] == 1 ) {
        int temp = arr [ i ] ;
        arr [ i ] = arr [ i + 1 ] ;
        arr [ i + 1 ] = temp ;
      }
      else return false ;
    }
  }
  return true ;
}


//TOFILL

}
