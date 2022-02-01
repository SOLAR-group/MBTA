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
public class MINIMUM_SUM_TWO_NUMBERS_FORMED_DIGITS_ARRAY_2{
static int f_gold ( int a [ ] , int n ) {
  Arrays . sort ( a ) ;
  int num1 = 0 ;
  int num2 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) num1 = num1 * 10 + a [ i ] ;
    else num2 = num2 * 10 + a [ i ] ;
  }
  return num2 + num1 ;
}


//TOFILL

}
