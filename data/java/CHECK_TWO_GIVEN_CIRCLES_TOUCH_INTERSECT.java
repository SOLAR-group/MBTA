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
public class CHECK_TWO_GIVEN_CIRCLES_TOUCH_INTERSECT{
static int f_gold ( int x1 , int y1 , int x2 , int y2 , int r1 , int r2 ) {
  int distSq = ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ) ;
  int radSumSq = ( r1 + r2 ) * ( r1 + r2 ) ;
  if ( distSq == radSumSq ) return 1 ;
  else if ( distSq > radSumSq ) return - 1 ;
  else return 0 ;
}


//TOFILL

}
