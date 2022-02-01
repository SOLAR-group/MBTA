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
public class NUMBER_JUMP_REQUIRED_GIVEN_LENGTH_REACH_POINT_FORM_D_0_ORIGIN_2D_PLANE{
static int f_gold ( int a , int b , int d ) {
  int temp = a ;
  a = Math . min ( a , b ) ;
  b = Math . max ( temp , b ) ;
  if ( d >= b ) return ( d + b - 1 ) / b ;
  if ( d == 0 ) return 0 ;
  if ( d == a ) return 1 ;
  return 2 ;
}


//TOFILL

}
