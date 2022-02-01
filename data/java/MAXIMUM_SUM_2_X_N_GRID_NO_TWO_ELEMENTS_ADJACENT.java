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
public class MAXIMUM_SUM_2_X_N_GRID_NO_TWO_ELEMENTS_ADJACENT{
public static int f_gold ( int grid [ ] [ ] , int n ) {
  int incl = Math . max ( grid [ 0 ] [ 0 ] , grid [ 1 ] [ 0 ] ) ;
  int excl = 0 , excl_new ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    excl_new = Math . max ( excl , incl ) ;
    incl = excl + Math . max ( grid [ 0 ] [ i ] , grid [ 1 ] [ i ] ) ;
    excl = excl_new ;
  }
  return Math . max ( excl , incl ) ;
}


//TOFILL

}
