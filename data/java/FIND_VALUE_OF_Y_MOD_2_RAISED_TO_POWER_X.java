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
public class FIND_VALUE_OF_Y_MOD_2_RAISED_TO_POWER_X{
static long f_gold ( long y , long x ) {
  if ( ( Math . log ( y ) / Math . log ( 2 ) ) < x ) return y ;
  if ( x > 63 ) return y ;
  return ( y % ( 1 << ( int ) x ) ) ;
}


//TOFILL

}
