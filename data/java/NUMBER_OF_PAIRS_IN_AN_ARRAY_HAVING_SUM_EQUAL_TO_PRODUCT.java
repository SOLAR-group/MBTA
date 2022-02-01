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
public class NUMBER_OF_PAIRS_IN_AN_ARRAY_HAVING_SUM_EQUAL_TO_PRODUCT{
static int f_gold ( int a [ ] , int n ) {
  int zero = 0 , two = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == 0 ) {
      zero ++ ;
    }
    if ( a [ i ] == 2 ) {
      two ++ ;
    }
  }
  int cnt = ( zero * ( zero - 1 ) ) / 2 + ( two * ( two - 1 ) ) / 2 ;
  return cnt ;
}


//TOFILL

}
