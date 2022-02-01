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
public class MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES_1{
static int f_gold ( int s ) {
  int length = s / 3 ;
  s -= length ;
  int breadth = s / 2 ;
  int height = s - breadth ;
  return length * breadth * height ;
}


//TOFILL

}
