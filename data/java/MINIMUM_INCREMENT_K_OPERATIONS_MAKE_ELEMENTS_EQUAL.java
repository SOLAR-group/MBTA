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
public class MINIMUM_INCREMENT_K_OPERATIONS_MAKE_ELEMENTS_EQUAL{
static int f_gold ( int arr [ ] , int n , int k ) {
  Arrays . sort ( arr ) ;
  int max = arr [ arr . length - 1 ] ;
  int res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( max - arr [ i ] ) % k != 0 ) return - 1 ;
    else res += ( max - arr [ i ] ) / k ;
  }
  return res ;
}


//TOFILL

}
