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
public class N_TH_ROOT_NUMBER{
static double f_gold ( int A , int N ) {
  double xPre = Math . random ( ) % 10 ;
  double eps = 0.001 ;
  double delX = 2147483647 ;
  double xK = 0.0 ;
  while ( delX > eps ) {
    xK = ( ( N - 1.0 ) * xPre + ( double ) A / Math . pow ( xPre , N - 1 ) ) / ( double ) N ;
    delX = Math . abs ( xK - xPre ) ;
    xPre = xK ;
  }
  return xK ;
}


//TOFILL

}
