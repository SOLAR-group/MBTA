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
public class CHECK_GIVEN_CIRCLE_LIES_COMPLETELY_INSIDE_RING_FORMED_TWO_CONCENTRIC_CIRCLES{
public static boolean f_gold ( int r , int R , int r1 , int x1 , int y1 ) {
  int dis = ( int ) Math . sqrt ( x1 * x1 + y1 * y1 ) ;
  return ( dis - r1 >= R && dis + r1 <= r ) ;
}


//TOFILL

}
