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
public class NUMBER_DIGITS_PRODUCT_TWO_NUMBERS{
static int f_gold ( int a , int b ) {
  int count = 0 ;
  int p = Math . abs ( a * b ) ;
  if ( p == 0 ) return 1 ;
  while ( p > 0 ) {
    count ++ ;
    p = p / 10 ;
  }
  return count ;
}


//TOFILL

}
