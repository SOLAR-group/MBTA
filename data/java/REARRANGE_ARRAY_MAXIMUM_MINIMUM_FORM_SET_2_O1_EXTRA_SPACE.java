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
class REARRANGE_ARRAY_MAXIMUM_MINIMUM_FORM_SET_2_O1_EXTRA_SPACE{
public static void f_gold ( int arr [ ] , int n ) {
  int max_idx = n - 1 , min_idx = 0 ;
  int max_elem = arr [ n - 1 ] + 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      arr [ i ] += ( arr [ max_idx ] % max_elem ) * max_elem ;
      max_idx -- ;
    }
    else {
      arr [ i ] += ( arr [ min_idx ] % max_elem ) * max_elem ;
      min_idx ++ ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) arr [ i ] = arr [ i ] / max_elem ;
}


//TOFILL

}
