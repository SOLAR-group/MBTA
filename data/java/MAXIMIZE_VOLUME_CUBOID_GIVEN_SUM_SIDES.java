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
public class MAXIMIZE_VOLUME_CUBOID_GIVEN_SUM_SIDES{
static int f_gold ( int s ) {
  int maxvalue = 0 ;
  for ( int i = 1 ;
  i <= s - 2 ;
  i ++ ) {
    for ( int j = 1 ;
    j <= s - 1 ;
    j ++ ) {
      int k = s - i - j ;
      maxvalue = Math . max ( maxvalue , i * j * k ) ;
    }
  }
  return maxvalue ;
}


//TOFILL

}
