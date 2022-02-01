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
public class SQUARE_ROOT_OF_A_PERFECT_SQUARE{
static float f_gold ( float n ) {
  float x = n ;
  float y = 1 ;
  double e = 0.000001 ;
  while ( x - y > e ) {
    x = ( x + y ) / 2 ;
    y = n / x ;
  }
  return x ;
}


//TOFILL

}
