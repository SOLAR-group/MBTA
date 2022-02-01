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
public class DYNAMIC_PROGRAMMING_HIGH_EFFORT_VS_LOW_EFFORT_TASKS_PROBLEM{
static int f_gold ( int high [ ] , int low [ ] , int n ) {
  if ( n <= 0 ) return 0 ;
  return Math . max ( high [ n - 1 ] + f_gold ( high , low , ( n - 2 ) ) , low [ n - 1 ] + f_gold ( high , low , ( n - 1 ) ) ) ;
}


//TOFILL

}
