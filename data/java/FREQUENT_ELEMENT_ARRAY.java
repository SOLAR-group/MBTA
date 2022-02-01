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
public class FREQUENT_ELEMENT_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  Arrays . sort ( arr ) ;
  int max_count = 1 , res = arr [ 0 ] ;
  int curr_count = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] == arr [ i - 1 ] ) curr_count ++ ;
    else {
      if ( curr_count > max_count ) {
        max_count = curr_count ;
        res = arr [ i - 1 ] ;
      }
      curr_count = 1 ;
    }
  }
  if ( curr_count > max_count ) {
    max_count = curr_count ;
    res = arr [ n - 1 ] ;
  }
  return res ;
}


//TOFILL

}
