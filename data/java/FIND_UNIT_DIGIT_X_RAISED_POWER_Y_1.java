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
public class FIND_UNIT_DIGIT_X_RAISED_POWER_Y_1{
static int f_gold ( int x , int y ) {
  x = x % 10 ;
  if ( y != 0 ) y = y % 4 + 4 ;
  return ( ( ( int ) ( Math . pow ( x , y ) ) ) % 10 ) ;
}


//TOFILL

}
