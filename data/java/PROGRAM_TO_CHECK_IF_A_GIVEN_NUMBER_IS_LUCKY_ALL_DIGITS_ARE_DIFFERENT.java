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
public class PROGRAM_TO_CHECK_IF_A_GIVEN_NUMBER_IS_LUCKY_ALL_DIGITS_ARE_DIFFERENT{
static boolean f_gold ( int n ) {
  boolean arr [ ] = new boolean [ 10 ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) arr [ i ] = false ;
  while ( n > 0 ) {
    int digit = n % 10 ;
    if ( arr [ digit ] ) return false ;
    arr [ digit ] = true ;
    n = n / 10 ;
  }
  return true ;
}


//TOFILL

}
