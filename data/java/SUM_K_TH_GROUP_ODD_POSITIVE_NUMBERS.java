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
public class SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS{
public static int f_gold ( int k ) {
  int cur = ( k * ( k - 1 ) ) + 1 ;
  int sum = 0 ;
  while ( k -- > 0 ) {
    sum += cur ;
    cur += 2 ;
  }
  return sum ;
}


//TOFILL

}
