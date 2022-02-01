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
public class FIND_HARMONIC_MEAN_USING_ARITHMETIC_MEAN_GEOMETRIC_MEAN{
static double f_gold ( int a , int b ) {
  double AM , GM , HM ;
  AM = ( a + b ) / 2 ;
  GM = Math . sqrt ( a * b ) ;
  HM = ( GM * GM ) / AM ;
  return HM ;
}


//TOFILL

}
