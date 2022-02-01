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
public class MINIMUM_TIME_TO_FINISH_TASKS_WITHOUT_SKIPPING_TWO_CONSECUTIVE{
static int f_gold ( int arr [ ] , int n ) {
  if ( n <= 0 ) return 0 ;
  int incl = arr [ 0 ] ;
  int excl = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int incl_new = arr [ i ] + Math . min ( excl , incl ) ;
    int excl_new = incl ;
    incl = incl_new ;
    excl = excl_new ;
  }
  return Math . min ( incl , excl ) ;
}


//TOFILL

}
