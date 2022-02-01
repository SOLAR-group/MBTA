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
public class NUMBER_UNIQUE_RECTANGLES_FORMED_USING_N_UNIT_SQUARES{
static int f_gold ( int n ) {
  int ans = 0 ;
  for ( int length = 1 ;
  length <= Math . sqrt ( n ) ;
  ++ length ) for ( int height = length ;
  height * length <= n ;
  ++ height ) ans ++ ;
  return ans ;
}


//TOFILL

}
