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
public class TRIANGULAR_NUMBERS{
static boolean f_gold ( int num ) {
  if ( num < 0 ) return false ;
  int sum = 0 ;
  for ( int n = 1 ;
  sum <= num ;
  n ++ ) {
    sum = sum + n ;
    if ( sum == num ) return true ;
  }
  return false ;
}


//TOFILL

}
