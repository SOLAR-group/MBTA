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
public class COUNT_PAIRS_DIFFERENCE_EQUAL_K{
static int f_gold ( int arr [ ] , int n , int k ) {
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) if ( arr [ i ] - arr [ j ] == k || arr [ j ] - arr [ i ] == k ) count ++ ;
  }
  return count ;
}


//TOFILL

}
