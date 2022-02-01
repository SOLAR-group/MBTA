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
public class CHECK_LARGE_NUMBER_DIVISIBLE_11_NOT{
static boolean f_gold ( String str ) {
  int n = str . length ( ) ;
  int oddDigSum = 0 , evenDigSum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) oddDigSum += ( str . charAt ( i ) - '0' ) ;
    else evenDigSum += ( str . charAt ( i ) - '0' ) ;
  }
  return ( ( oddDigSum - evenDigSum ) % 11 == 0 ) ;
}


//TOFILL

}
