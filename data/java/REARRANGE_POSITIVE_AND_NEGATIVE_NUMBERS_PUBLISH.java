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
class REARRANGE_POSITIVE_AND_NEGATIVE_NUMBERS_PUBLISH{
static void f_gold ( int arr [ ] , int n ) {
  int i = - 1 , temp = 0 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    if ( arr [ j ] < 0 ) {
      i ++ ;
      temp = arr [ i ] ;
      arr [ i ] = arr [ j ] ;
      arr [ j ] = temp ;
    }
  }
  int pos = i + 1 , neg = 0 ;
  while ( pos < n && neg < pos && arr [ neg ] < 0 ) {
    temp = arr [ neg ] ;
    arr [ neg ] = arr [ pos ] ;
    arr [ pos ] = temp ;
    pos ++ ;
    neg += 2 ;
  }
}


//TOFILL

}
