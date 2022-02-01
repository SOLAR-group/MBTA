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
public class MAXIMUM_EQULIBRIUM_SUM_ARRAY{
static int f_gold ( int [ ] arr , int n ) {
  int res = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int prefix_sum = arr [ i ] ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) prefix_sum += arr [ j ] ;
    int suffix_sum = arr [ i ] ;
    for ( int j = n - 1 ;
    j > i ;
    j -- ) suffix_sum += arr [ j ] ;
    if ( prefix_sum == suffix_sum ) res = Math . max ( res , prefix_sum ) ;
  }
  return res ;
}


//TOFILL

}
