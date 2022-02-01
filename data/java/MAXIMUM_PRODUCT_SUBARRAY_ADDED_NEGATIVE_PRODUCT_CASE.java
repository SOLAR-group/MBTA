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
public class MAXIMUM_PRODUCT_SUBARRAY_ADDED_NEGATIVE_PRODUCT_CASE{
static int f_gold ( int arr [ ] , int n ) {
  int i ;
  int ans = Integer . MIN_VALUE ;
  int maxval = 1 ;
  int minval = 1 ;
  int prevMax ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] > 0 ) {
      maxval = maxval * arr [ i ] ;
      minval = Math . min ( 1 , minval * arr [ i ] ) ;
    }
    else if ( arr [ i ] == 0 ) {
      minval = 1 ;
      maxval = 0 ;
    }
    else if ( arr [ i ] < 0 ) {
      prevMax = maxval ;
      maxval = minval * arr [ i ] ;
      minval = prevMax * arr [ i ] ;
    }
    ans = Math . max ( ans , maxval ) ;
    if ( maxval <= 0 ) {
      maxval = 1 ;
    }
  }
  return ans ;
}


//TOFILL

}
