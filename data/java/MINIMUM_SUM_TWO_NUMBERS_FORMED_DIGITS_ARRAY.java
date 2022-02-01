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
public class MINIMUM_SUM_TWO_NUMBERS_FORMED_DIGITS_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  Arrays . sort ( arr ) ;
  int a = 0 , b = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 != 0 ) a = a * 10 + arr [ i ] ;
    else b = b * 10 + arr [ i ] ;
  }
  return a + b ;
}


//TOFILL

}
