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
public class CHECK_IF_ALL_THE_ELEMENTS_CAN_BE_MADE_OF_SAME_PARITY_BY_INVERTING_ADJACENT_ELEMENTS{
static boolean f_gold ( int [ ] a , int n ) {
  int count_odd = 0 , count_even = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( a [ i ] & 1 ) == 1 ) count_odd ++ ;
    else count_even ++ ;
  }
  if ( count_odd % 2 == 1 && count_even % 2 == 1 ) return false ;
  else return true ;
}


//TOFILL

}
