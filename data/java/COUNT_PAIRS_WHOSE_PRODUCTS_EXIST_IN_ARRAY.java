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
public class COUNT_PAIRS_WHOSE_PRODUCTS_EXIST_IN_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int result = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      int product = arr [ i ] * arr [ j ] ;
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        if ( arr [ k ] == product ) {
          result ++ ;
          break ;
        }
      }
    }
  }
  return result ;
}


//TOFILL

}
