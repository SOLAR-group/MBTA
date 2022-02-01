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
public class CHECK_IF_A_NUMBER_IS_JUMBLED_OR_NOT{
static boolean f_gold ( int num ) {
  if ( num / 10 == 0 ) return true ;
  while ( num != 0 ) {
    if ( num / 10 == 0 ) return true ;
    int digit1 = num % 10 ;
    int digit2 = ( num / 10 ) % 10 ;
    if ( Math . abs ( digit2 - digit1 ) > 1 ) return false ;
    num = num / 10 ;
  }
  return true ;
}


//TOFILL

}
