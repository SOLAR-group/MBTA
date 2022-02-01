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
public class MODULUS_TWO_FLOAT_DOUBLE_NUMBERS{
static double f_gold ( double a , double b ) {
  if ( a < 0 ) a = - a ;
  if ( b < 0 ) b = - b ;
  double mod = a ;
  while ( mod >= b ) mod = mod - b ;
  if ( a < 0 ) return - mod ;
  return mod ;
}


//TOFILL

}
