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
public class CHECK_NUMBER_IS_PERFECT_SQUARE_USING_ADDITIONSUBTRACTION{
static boolean f_gold ( int n ) {
  for ( int sum = 0 , i = 1 ;
  sum < n ;
  i += 2 ) {
    sum += i ;
    if ( sum == n ) return true ;
  }
  return false ;
}


//TOFILL

}
